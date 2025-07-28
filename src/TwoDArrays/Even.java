package TwoDArrays;
import java.util.Scanner;
public class Even {
    public static void main(String args[])
    {
        //4 6 7
        //4 6 8
        //5 7 8
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
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]%2==0)
                {
                    System.out.print(arr[i][j]+ " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
