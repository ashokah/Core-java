package TwoDArrays;
import java.util.Scanner;
public class Scanners {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //6
        //3 4
        //3 2 4

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0&& j==1||i==0 && j==2||i==1 && j==2)
                {
                    System.out.print(" ");
                }
                else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
