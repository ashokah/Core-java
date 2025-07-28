public class Test {
    String name(String a,String b)
    {
        return a+b;
    }
    String name(String a,String b,String c)
    {
        return a+b+c;
    }
    String name(String a, String b,String c,String d)
    {
        return a+b+c+d;
    }
    public static void main(String args[])
    {
        Test t=new Test();
        System.out.println(t.name("phani","sri"));
        System.out.println(t.name("aa","bb","cc"));
        System.out.println(t.name("a","b","c","d"));
    }
}
