package Arrays;

public class Average {
        public static void main(String args[])
        {
            int a[]={1,1,1,2};
            int s=0;
            for(int i=0;i<a.length;i++)
            {
                s+=a[i];
            }
            double b=(double)s/a.length;
            System.out.println(b);
        }
}
