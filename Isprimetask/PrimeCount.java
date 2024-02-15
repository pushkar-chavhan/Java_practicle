class Sy2022bit001{
	int randomNumber[]=new int [1000000];
	public int generateRandomNum(){
		for(int i=0;i<=7;i++){
			rendomNumber[i]=countPrimeNumber(int randomNumber[]);
		}	
	}
	public int generate7DigitNumber(int b){
		int count=0;
		while(b>0){
		count++;
		}
		if(count==7){
		return count;
		}
		else{
		return -1;
		}
	}
	public int countPrimeAndNonprime(int x){
		x=randomNumber;
		int primecount=0;
		int nonprimecount=0;
		if(isPrime(x)){
			primecount++;
		}else{
		nonprime++;
		}
	}
	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i*i<number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args){
	int p;
	p=countPrimeAndNonprime(randomNumber[]);
	}
}
