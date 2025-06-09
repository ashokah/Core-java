public class LoopingStatements {
    public static void main(String[] args) {
//         print 10 numbers using for
        /*/for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }*/


        /*    *
              * *
              * * *
              * * * *
              * * * * *
         */

   /*     int n =5;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        int n=4;
        int m=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1 || j==1 || i==n || j==m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


//        print thr numbers in patter upto 8
//
/*        int n=8;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

//        printing in reverse order
     /*   int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/



//  to print alernative 0's and 1's
   /*     int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j) % 2==0)
                {
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }*/

//     to print box without spaces
  /*      int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //to  print both pattern * order
        /*int n=5;
        for(int row=1;row<2*n;row++)
        {
            int totalColumsInRow =  row > n ? 2*n - row  : row;
            for(int col=1;col<=totalColumsInRow;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

//        to print daimond problem
       /* int n=5;
        for(int row =0;row<2*n;row++)
        {
            int TotalColsInRow = row>n? 2*n -row : row;
            int TotalSpaces = n-TotalColsInRow;
            for(int s=0;s<TotalSpaces;s++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<TotalColsInRow;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
    }
}




