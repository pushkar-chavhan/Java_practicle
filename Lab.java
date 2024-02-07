class Father{
	int balance=200;
	static String s="pushkar";
	public static void main(String [] args){
		Father f=new Father();
		System.out.println(f.balance);
		System.out.println(f.s);
		Father d=new Father();
		System.out.println(d.fun(5,45,21));
		
	}
	public int fun(int ...b){ //here i am variance
		//System.out.println(a);
		System.out.println(b);
		return 0;
		
	}
}
