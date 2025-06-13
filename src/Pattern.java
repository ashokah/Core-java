public class Pattern {
    public static void main(String[]  args)
    {

    /*  *
        * *
        * * *
        * * * *
        * * * * *
        */

        int n= 5;
        // outer loop
        for(int i=1;i<=n;i++)
        {
            // inner loop -> print star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


   /*   * * * *
        * * * *
        * * * *
        * * * *
        */
        int m=4;
        System.out.println("Square pattern");
        //outer loop
        for(int i=1;i<=m;i++)
        {
            //inner loop -> print star
            for(int j=1;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

     /*
                   *
                 * *
               * * *
             * * * *
        */
          // spaces have to consider
        int x=5;
        // outer loop
        for(int i=1;i<=x;i++)
        {
            // inner loop -> print space
            for(int j=1;j<=x-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    /*        *
          * * * * *
              *
              *    */

         int y=5;
         System.out.println("Print Plus Symbol");
         // outer loop
         for(int i=1;i<=y;i++)
         {
             // inner loop
             for(int j=1;j<=y;j++) {
                 if (i == 3 || j == 3) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }

   /*    * * * *
         *     *
         *     *
         * * * *
*/
         int z=4;
         // outer loop
         for(int i=1;i<=z;i++)
         {
             // inner loop -> print space
             for(int j=1;j<=z;j++)
             {
                 if(i==1|| j==1 || i==z || j==z) {
                     System.out.print("*");
                 }else
                 {
                     System.out.print(" ");

                 }
             }
             System.out.println();
         }



/*
         * * * *
         * * *
         * *
         *

*/
        int a=4;
        System.out.println(" print inverted pattern");
        // outer loop
        for(int i=a;i>=1;i--)
        {
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
