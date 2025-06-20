public class Static {
    static int a;
    static void incr()
    {
        System.out.println("Static method");
        a= a+50;
        System.out.println(a);
    }
    static
    {
        System.out.println("Static block");
        a=10;
    }
    public static void main(String[] args)
    {
        System.out.println("Main Method"+  a);
        incr();
    }
}
