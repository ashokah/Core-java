package TwoDArrays;

public class Square {
    public static void main(String args[])
    {
        // 1 2 3
        // 1   3
        // 1 2 3
        int arr[][]={{1,2,3},{1,2,3},{1,2,3}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==1 && j==1)
                {
                    System.out.print("  ");
                }
                else {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println(" ");
        }
    }
}
