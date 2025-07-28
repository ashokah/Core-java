import java.util.Scanner;
public class Patterns {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == 1 || j == 1 || (i == j && i >= 5) || j == n - i + 1) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//        }
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || j == 1 || j == n - i + 1 || i >= 5 && i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++) {
//            for (int j = 1; j <= n; j++) {
//
//                if (i == 1 || j == 1 || i == n || j == n || i == j || j == n - i + 1) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
    }
}
