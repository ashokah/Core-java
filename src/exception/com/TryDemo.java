package exception.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo {

    //checked exception -- at compile time eg:i/o exception,SQl exception
     // and we can handle the exception using the try and catch
    //unchecked exception -- at run time

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        /*try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("result is " + c);
        }
        catch(Exception e) {
            System.out.println("divide by zero");
        }
        finally{

            System.out.println("hello");
        }*/

        try{
            System.out.println("enter 1st number");
            int a=sc.nextInt();
            System.out.println("enter 2nd number");
            int b=sc.nextInt();
            int c= a/b;
            System.out.println("result "+c);
        }catch(ArithmeticException ae)
        {
            System.out.println("divided with zero");
        }
        catch(InputMismatchException ime)
        {
            System.out.println("input is different");
        }

        catch(Exception e)
        {
            System.out.println("something went wrong");
        }
        finally
        {
            System.out.println("bye");
        }

    }











}
