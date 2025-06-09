public class PatternNumbers {
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();

        }
         int m=5;
         int number =1;
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }


        int x=5;
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j) % 2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
