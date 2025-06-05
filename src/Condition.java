public class Condition {
    public static void main(String[] args) {

        // if statement
        int num = 10;
        if(num < 15)
            System.out.println("num is less than 15");


        // if statement using string

        String name = "Hema";
        if(name == "Hema")
            System.out.println("name is Hema");

        //if - else statement

        int age =15;
        if(age >=18)
        {
            System.out.println("eligible to vote");
        }
        else
            System.out.println("Not eligible to vote");


        // if-else-if ladder
        int x=0;
        if(x < -5)
        {
            System.out.println("x is greater than 30");
        }
        else if(x == 30)
        {
            System.out.println("x is less than 30");
        }
        else
        {
            System.out.println("x :"+x);
        }


       //nested if-else statement
        int n1=12,n2=40,n3=15,largest;
        if(n1 >= n2){
            if(n1 >= n3)
            {
                largest =n1;
            }
            else {
                largest =n3;
            }
        }
        else
        {
            if(n2>=n3)
            {
                largest = n2;
            }
            else
            {
                largest = n3;
            }
        }
            System.out.println("largest ;"+largest);



        //switch case

        char ch = 'a';
        switch(ch){
            case 'a':
                System.out.println("Hi");
                break;
            case 'b':
                System.out.println("b");
                break;
            default:
                System.out.println(ch);
        }
    }
}
