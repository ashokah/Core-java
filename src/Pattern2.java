public class Pattern2 {
    public static void main(String[] args) {


            /*1
              2
              3
            12345
              4
              5*/


        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==3)
                {
                    System.out.print(j);
                }
                else if(i==3 || j==3)
                {
                    System.out.print(i);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
