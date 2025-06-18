public class multipattern {
    public static void main(String[] args) {
        for(int j=1;j<=5;j++)
        {
            for(int i=1;i<=5;i++)
            {
            if(j==3)
            {
                System.out.print(i);

            }
            else if(j==3||i==3)
            {

                System.out.print(j);
            }
            else {
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
}
