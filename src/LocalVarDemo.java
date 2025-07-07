public class LocalVarDemo {


    // local variables
    // 1. a variable which is return inside the method or constructor or block is called local variable
    // 2. when the block or method is executed that time the memory is created and
    // once the method execution is completed that time the allocated memory will be destroyed
    //3. for local variables their is no access modifiers
    //4. befor using the local variables we have to intialize the variable because the jvm doesnt provide the default values for local varibales
    //5. local variables are stored in th stack area

    public static void main(String[] args)
    {
        int x=10;
        System.out.println(x);
        Hello();
        LocalVarDemo l = new LocalVarDemo(400);
    }

    static void Hello()
    {
        System.out.println("hiii");
        int x=20;
        System.out.println(x);
    }

     LocalVarDemo(int x)
    {
        System.out.println(x);
    }
}
