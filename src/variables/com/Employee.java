package variables.com;
public class Employee {
    // static variables

    //1. a variable which is declared inside the class but not inside the method,block,constructor (same as instance variables)
    //2. the difference between the static and non-static variables is memory allocation
    //3. for static variables the memory allocation will be done only once and it will be shared  among all the objects
    //4. constants variables are declared as static
    //5. all static variables are not constant , only final variables are constant
    //6. if we dont give any value then jvm will provide default variable
    //7. without creating the object also we can also access the variables using class name.variable

    String fullName;
    static String company;


    public static void main(String[] args)
    {
        Employee siddhu = new Employee();
        siddhu.fullName = "siddhartha";
        siddhu.company = "TCS";


        Employee buddhu = new Employee();
        buddhu.fullName = "Budeshwar";
        buddhu.company = "TCS";

        System.out.println("Employee deatils");

        System.out.println("siddhu full name "+ siddhu.fullName);
        System.out.println("siddhu working in "+ siddhu.company);

        System.out.println("---------------------------------");

        System.out.println("buddhu full name "+ buddhu.fullName);
        System.out.println("buddhu working in "+ buddhu.company);

        System.out.println(" after 1 year");

        siddhu.company = "deloitte";

        System.out.println("siddhu working in "+ siddhu.company);

        System.out.println("buddhu working in "+ buddhu.company);
    }



























}
