class PrimeChecker {
    static int[] randomNumbers = new int[1000000];

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        generateRandomNumbers();
        int primeCount = countPrimes();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time taken to generate and count primes: " + elapsedTime + " milliseconds");
        System.out.println("Total prime numbers: " + primeCount);

        printPrimesAndNonPrimes();
    }

    public static void generateRandomNumbers() {
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = generateRandom7DigitNumber();
        }
    }

    public static int countPrimes() {
        int primeCount = 0;
        for (int number : randomNumbers) {
            if (isPrime(number)) {
                primeCount++;
            }
        }
        return primeCount;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int generateRandom7DigitNumber() {
        return (int) (Math.random() * (9999999 - 1000000 + 1)) + 1000000;
    }

    public static void printPrimesAndNonPrimes() {
        int primePrintCount = 0;
        int nonPrimePrintCount = 0;
        int totalCount = 0;

        while (primePrintCount < 5 || nonPrimePrintCount < 5) {
            int randomNumber = randomNumbers[totalCount];
            if (isPrime(randomNumber) && primePrintCount < 5) {
                System.out.println("Prime Number: " + randomNumber);
                primePrintCount++;
            } else if (!isPrime(randomNumber) && nonPrimePrintCount < 5) {
                System.out.println("Non-Prime Number: " + randomNumber);
                nonPrimePrintCount++;
            }
            totalCount++;
        }
    }
}
