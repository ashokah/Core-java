public class Reversepattern {
    public static void main(String args[]) {
       int n=5;
       for(int i=5;i>=1;i--)
       {
           //5
           //  4
           //     3
           //        2
           //           1
           for(int j=5;j>=1;j--)
           {
               if(j==i) {
                   System.out.print(i);
               }
               else
               {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}



