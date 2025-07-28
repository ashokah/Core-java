 class Child{
     final int age=10;
    final void print(){
        System.out.println(age);
    }
}
class Subchild extends Child{
    int age=10;
}
public class Final {
    public static void main(String args[])
    {
        Child c=new Child();
        c.print();

    }
}
