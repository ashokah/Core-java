public class NumberPatterns {
    public static void main(String args[]) {
        //1 1 1 2 1 3
        //2 1 2 2 2 3
        //3 1 3 2 3 3
        //4 1 4 2 4 3
        //5 1 5 2 5 3

//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= 3; j++) {
//                System.out.print(i + " " + j + " ");
//            }
//            System.out.println();
//        }


        //1 2 3 4 5
        //5 4 3 2 1
        //1 2 3 4 5
        //5 4 3 2 1
        //1 2 3 4 5
//        int n = 5;
//        for (int i = 1; i < n; i++) {
//            if (i % 2 != 0) {
//                for (int j = 1; j < n; j++) {
//                    System.out.print(j);
//                }
//                System.out.println();
//            } else {
//                for (int k = 4; k >= 1; k--) {
//                    System.out.print(k);
//                }
//                System.out.println();
//            }
//        }
//        System.out.println();


        //1 2 3 4 5
        //6 7 8 1 2
        //3 4 5 6 7
        //8 1 2 3 4
        //5 6 7 8 1

               int n=5;
               int s=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++){
                if(s<=8)
                {
                    System.out.print(s);
                    s++;
                }
                else
                {
                    s=1;
                    System.out.print(s);
                    //s++;
                }
            }
            System.out.println();
        }

    }
}
