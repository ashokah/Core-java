public class Plus {
   public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++)
       {
          for(int j=1;j<=n;j++)
          {
              if(i==j||j==(n-i+1)) //1==1 2==5-1+1=5
                  //3==1 3==5-1+1=5 1     1
                                     // 2  2
                  //4==1 4==5           3
                  //5==1 5==5
              {
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
