public class FibonacciNumber {
    public static void main(String[] args)
    {
        int fib =0,fib1 =1 ,fib2;
        for(int i=1;i<=10;i++)
        {
            System.out.print(fib+ " ");
            fib2 = fib1 + fib;
            fib =fib1;
            fib1=fib2;
        }
    }
}
