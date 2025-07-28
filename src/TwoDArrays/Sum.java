package TwoDArrays;

public class Sum {
    public static void main(String args[])
    {
        int arr[][]={{1,2,3},{1,2,3},{1,2,3}};
        int sum=0;
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
