public class PrimeNumber {
    public static void main(String[] args)
    {
        int n=5;
        int count =0;
        int loopCounter=0;
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                loopCounter++;
                if(n%i==0)
                    count++;
            }
            if(count==0)
            {
                System.out.println("Prime Number");
            }
            else
            {
                System.out.println("not a prime number");
            }
            System.out.println("your loopCounter run" +  loopCounter + "times");
    }
}
