import java.util.Scanner;

public class multiplicationpattern {
    public static  void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=10;i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
        int p=10;
        int q=20;
        while(p<=10&&q<10)
        {
            if(p<=10) {

                System.out.println(p);
                System.out.println(q);
            }
            p++;
            q++;
        }

    }
}
