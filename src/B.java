public class B {
    protected void display()
    {

        System.out.println("Hello");
    }
    int age;
    private class s extends B {
        void m() {

            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        Accessmodifiers a = new Accessmodifiers();
        B obj=new B();
        s b = obj.new s();
        b.display();
    }
}
