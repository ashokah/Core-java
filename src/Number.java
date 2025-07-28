public class Number {
    public static void main(String args[])
    {
        //12345
        //23451
        //34512
        //45123
        //54321
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n;j++) {
                if (i == 5)
                {
                    System.out.print(i - j);
                    continue;
                }
                int sum=i+j;
                if(sum>5)
                {
                    System.out.print(sum-5);
                }
                else
                {
                    System.out.print(sum);
                }
            }
            System.out.println();
        }
    }
}
