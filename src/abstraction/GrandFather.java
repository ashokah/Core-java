package abstraction;

public abstract class GrandFather {

    // in abstract class we can have the non-abstract methods and the abstract methods
    void m1()
    {
        System.out.println("normal method");
    }


    // abstract method will have only the declaration but thier is no implementation or body
    //if we declare a method as abstract, the class must be an abstract class
     abstract void m2();


    // we cannot create the object for the abstract class because it is not fully implemented
    // GrandFather gf = new GrandFather();
}
