package exception.com;

import java.util.Scanner;

public class Banking {
        public static void main(String[] args) throws InvalidDepositAmountException {
            Scanner sc = new Scanner(System.in);
            System.out.println("welcome");

            System.out.println("enter your name");
            String name =sc.next();

            System.out.println("enter your age");
            int age= sc.nextInt();

            System.out.println("enter deposit amount");
            int depositAmount =sc.nextInt();

            if(depositAmount<1000){

                throw new InvalidDepositAmountException("the minimum amount should be 1000");
            }
        }
}
