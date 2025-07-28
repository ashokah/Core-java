package TwoDArrays;
import java.util.Scanner;
public class Arrays {
    public static void main(String args[])
    {
//        // 1
//               2
//                    3
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < m; j++)
            {
                if(i==j)
                {
                    System.out.print(arr[i][j]+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
