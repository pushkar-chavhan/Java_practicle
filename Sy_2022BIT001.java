public class Sy_2022BIT001{
	public static void main(String[] args){
	print();
	int arr[]={1,2,3,4,5,6};
	int f=firstelement(arr);
	System.out.println(f);
	int l=lastelement(arr);
	System.out.println(l);
	int s=sumofArray(arr);
	System.out.println(s);
	int x=secondLast(arr);
	System.out.println(x);
	} 
	public static void print(){
		System.out.println("Hello World");
	}
	public static int firstelement(int [] arr){
		return arr[0];
	}
	public static int lastelement(int [] arr){
		for(int i=0;i<=arr.length;i++){
		return arr[arr.length-1];
		}
		return 1;
	}
	public static int sumofArray(int [] arr){
		int sum=0;
		for(int i=0;i<=arr.length;i++){
			sum=sum+i;
		}
		return sum;
	}
	public static int secondLast(int [] arr){
		for(int i=0;i<=arr.length;i++){
			return arr[arr.length-2];
		
		}
		return 1;
	}
}
