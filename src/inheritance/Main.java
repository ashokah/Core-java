package inheritance;

public class Main {
    public static void main(String[] args)
    {
        Cat c = new Cat();
        c.eat();
        c.walk();
        Babycat c1 = new Babycat();
        c1.eat();
        c1.drive();
    }
}
