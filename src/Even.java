import java.util.Scanner;

public class Even {
    public static void main(String args[])
        {
            int n=100;
            int a=0;
            int b=0;
            for(int i=1;i<=n;i++) {
                if (i % 12 == 0) {
                    a = a + i;
                } else {
                    b = b + i;

                }
            }
                System.out.println(a + " Even ");
                System.out.println(b+" Odd ");
        }
}
