class student{
	String name="pushkar";
	String id="2022bit001";
	String department="IT";
}
class library_assist extends student{
	public boolean checkId(String id)
	{
		if(id=="2022bit001")
		{
		return true;
		}else{
		return false;
		}
	}
	public  boolean checkdues(int due)
	{
		if(due<=4)
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	public boolean iseligible(int due){
		
		if(due<4)
		{
		return true;
		}
		else{
		return false;
		}
	}
	public boolean isbookAvailable(String book)
	{
		if(book=="java")
		{
		return true;
		}
		else
		{
		return false;
		}
	} 
	public boolean renew(int days)
	{
		if(days>30)
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	public static void main(String[] args)
	{
	 library_assist s= new  library_assist();
	 System.out.println("Is the ID of student is valid-->"+s.checkId("2022bit001"));
	 System.out.println("Is there is any dues on student-->"+s.checkdues(9));
	 System.out.println("Is I am eligible to take a book-->"+s.iseligible(9));
	 System.out.println("Is requred book is availabe-->"+s.isbookAvailable("java"));
	 System.out.println("Is there is requrenment to renew the books-->"+s.renew(9));
	} 
}
