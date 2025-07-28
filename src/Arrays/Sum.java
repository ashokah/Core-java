package Arrays;

public class Sum {
        public static void main(String args[])
        {
            int a[]={2,1,3};
            int sum=a[0];
            for(int i=1;i<a.length;i++)
            {
                sum+=a[i];
            }
            System.out.println(sum);
        }
}
