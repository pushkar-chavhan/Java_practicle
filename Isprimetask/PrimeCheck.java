
class RandomNumberGenerate
{
    public void generateNumber(int []array,int length)
    {
        long givenNum=0l;
        for(int i=0;i<length;i++)
        {
            givenNum += System.currentTimeMillis();
            if(givenNum%9999999 < 1000000)
            {
                givenNum += System.nanoTime()+1263485;
            }
            array[i] = (int)Math.abs(givenNum%(int)9999999);
            givenNum = givenNum + 187246+System.nanoTime(); 
        }
    }
}
class PrimeNumberCount
{
    public static boolean isPrime(int num)
    {
        for(int i=2;i*i < num;i++)
        {
            if(num %i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public int[] countPrimeOrNot(int array[],int length)
    {
        int primeCount =0;
        int nonPrimeCount =0;

        for(int i=0;i<length;i++)
        {
            if(isPrime(array[i]))
            {
                primeCount++;
            }
            else
            {
                nonPrimeCount++;
            }
        }
        return new int[]{primeCount,nonPrimeCount};
    }
   

    public static void main(String[] args) {
    int array[] = new int[1000000];
    RandomNumberGenerate num = new RandomNumberGenerate();
    num.generateNumber(array, 1000000);
    PrimeNumberCount.printData(array);
    PrimeNumberCount objPrime = new PrimeNumberCount();
  
    System.out.println("Prime or Non-Prime:");
    for(int i=0;i<5;i++)
    {
        long start = System.currentTimeMillis();
        int arr[] = objPrime.countPrimeOrNot(array, 1000000);
        long end = System.currentTimeMillis();
        long duration = end-start;
        System.out.println(duration);
        
    }
    }
    

    public static void printData(int array[])
    {
        for(int i=0;i<array.length;i++)
        System.out.println(array[i]);
    }
}
