package exception.com;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) throws NotEligibleToVote {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();

        System.out.println("enter your age");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new NotEligibleToVote("age must be greater than 18 ");
            }
        }catch(Exception e)
        {
            System.out.println("age must be greater than 18");
        }

    }
}
