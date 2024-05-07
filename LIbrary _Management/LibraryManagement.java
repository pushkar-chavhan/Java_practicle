import java.util.ArrayList;
import java.util.List;

interface Borrowable {
    void borrowBook(String title);
}

interface Returnable {
    void returnBook(String title);
}

class Book {
    private String title;
    private boolean available;

    public Book(String title) {
        this.title = title;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Student {
    private int registrationNumber;
    private boolean valid;

    public Student(int registrationNumber) {
        this.registrationNumber = registrationNumber;
        this.valid = checkValidity(registrationNumber);
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isValid() {
        return valid;
    }

    private boolean checkValidity(int regNumber) {
        return regNumber > 0 && regNumber < 100;
    }
}

class Library implements Borrowable, Returnable {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle());
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("You have borrowed the book: " + title);
                return;
            }
        }
        System.out.println("Sorry, the book '" + title + "' is either not available or does not exist.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("You have returned the book: " + title);
                return;
            }
        }
        System.out.println("You cannot return the book '" + title + "'.");
    }
}

 class MainMethod {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Java Programming"));
        library.addBook(new Book("Data Structures and Algorithms"));
        library.addBook(new Book("Database Management"));

        Student student1 = new Student(34);

        library.displayAvailableBooks();

        library.borrowBook("Java Programming");
        library.borrowBook("Artificial Intelligence");
        library.returnBook("Java Programming");
        library.returnBook("Database Management");
    }
}

