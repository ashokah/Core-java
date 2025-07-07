public class HdfcBankingApp {

    //1. a variable which is declared inside the class but not inside any method or block or constructor
    //2. This variables are created when the object is created to that class, it will be destroyed when the object is cleared from the memory
    //3. we shou;d declare instance variables when we need to refer the same variable in multiple blocks,methods
    //4. we can use  all access modifiers with instance variables
    //5. instance variables have default values provided by the JVM, even if we don't initialize the variables also
    // for numbers the default value is zero and for boolean the default values is false.
    //6. we can initialize instance variables in 4 ways
         // at the time of declaration
         // through constructor
         // through getters and setters
         // through object reference.
         //-----------------------------------------------------------------------------

    // the gst is same for the all the loans , so if we want to change the gst value then we have to change in three places.
    // so to avoid that we can initialize gst as instance variable(inside the class) instead variable as local(inside method)
    // so that we can access the same variable in multiple methods or block.


    int gst; // default value is provided by the jvm
    //int gst = 5
    // public int gst =5; // access modifier can be allowed

    boolean isNewCustomer = true; // default value is provided by the jvm
    // boolean isNewCustomer;

    public static void  main(String[] args)
    {
        HdfcBankingApp hdfc = new HdfcBankingApp();
        hdfc.gst = 28; // through object reference
        System.out.println(hdfc.isNewCustomer);
        System.out.println(hdfc.gst);
        hdfc.educationLoan();
        hdfc.homeLoan();
        hdfc.personalLoan();

    }

    void homeLoan()
    {
        // local variable
        double homeLoanROI = 8.5;
        //int gst =5;
        System.out.println("Welcome to home Loan " + homeLoanROI);
        System.out.println("Gst is " + gst);
    }

    void educationLoan()
    {
        // local variable
        double educLoan = 12;
        //int gst =5;
        System.out.println("Welcome to education laon " + educLoan);
        System.out.println("Gst is "+ gst);
    }

    void personalLoan()
    {
        //local variable
        double persLoan = 9.5;
        //int gst=5;
        System.out.println(" Welcome to personal Loan " + persLoan);
        System.out.println("Gst is "+ gst);

    }


















}
