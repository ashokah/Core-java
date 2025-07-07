package variables.com;

public class Demo {

    // all static variables are not constant
        static int watchCost = 300000;

        static final int roi = 5;
    public static void main(String[] args)
    {
        System.out.println("the watchCost is "+ Demo.watchCost);

        watchCost =300;
        // the cost is changing even though it is static variable , only final variables are constant
        System.out.println("now watch cost is " + Demo.watchCost);

        // roi= 20; // we cannot change the variable because it is final variable
        System.out.println("roi value is "+ Demo.roi);



    }













}
