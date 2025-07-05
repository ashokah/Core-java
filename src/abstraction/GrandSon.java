package abstraction;

public class GrandSon extends Father{


    void m2()
    {
        System.out.println("Grandson method");
    }





    public static void main(String[] args)
    {
        GrandSon s = new GrandSon();
        s.m1();
        s.m2();
        s.m3();
    }




}
