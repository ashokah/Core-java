package accessmodifiers;

public class Staff {

    // within same package  but different class we can access the data if we are using public modifier
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.rollNo);
        s.printRollNumber();
    }

}
