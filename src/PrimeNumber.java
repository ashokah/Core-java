public class PrimeNumber {
    public static void main(String[] args)
    {
        int n=29;
        int count =0;
            for(int i=2;i<=n-1;i++)
            {
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
    }
}
