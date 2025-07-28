package Arrays;

public class MaxArray {
        public static void main(String args[]){
            int arr[]={2,3,-1,2,55,10};
            int max=0;
            for(int i=0;i<arr.length-1;i++)
            {
                if(max<=arr[i])
                {
                    max=arr[i] ;

                }
            }
            System.out.println(max);
        }
}
