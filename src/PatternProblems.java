public class PatternProblems {
    public static void main(String[] args)
    {
        /*

        * * * * * * *
        * *       * *
        *   *   *   *
        *     *     *
        *   *   *   *
        * *       * *
        * * * * * * *


        */


        /*int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++) {

                if (i == 1 || j == 1|| i == n || j == n || i==j ||j==n-i+1 ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


        /*

        * * * * * * *
        *         *
        *       *
        *     *
        *   *   *
        * *       *
        *           *


        */


        int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++) {

                //if(i==1 || j==1 || j==n-i+1 || i==5 && j==5 || i==6 && j==6 || i==7 && j==7)
                 if(i==1 || j==1 || j==n-i+1 || i>=5 && i==j)
                 {
                    System.out.print("*");
                    }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println("--------------------------------------------------------");



        /*

         * * * * * * *
           *         *
             *       *
               *     *
              *  *   *
            *      * *
          *          *






        */



        int m=7;
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if( i==1|| j==m || i==j || i>=5 && j==m-i+1 )
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

































    }
}
