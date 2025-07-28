package TwoDArrays;
import java.util.Scanner;
public class Diagonal {
    public static void main(String args[])
    {
        //       8
        //     3 5
        //   4 5 6
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < m; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
    {
        for (int j = 0; j < m; j++) {
            if (i == 0 && j == 0 || i ==0 &&j==1  || i == 1 && j == 0)
            {
                System.out.print( "  ");
            }
            else{
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println(" ");
    }

    }
}
