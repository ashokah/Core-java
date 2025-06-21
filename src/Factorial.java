public class Factorial {
    static long noRecursion(int num) {
        long fact = 1;
        while (num > 0)
            fact = fact * num--;
        return fact;
    }
    public static void main(String[] args)
    {
        System.out.println("factorial of 5");
        System.out.println(Factorial.noRecursion(5));
    }
}


//        int n=7 ,result=1;
//        for(int i=1;i<=n;i++) {
//            result = result * i;
//        }
//        System.out.println(result);














