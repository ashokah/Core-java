import java.util.Scanner;
public class Binarysearch {
    public int binary(int arr[],int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] > k) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Binarysearch b=new Binarysearch();
        int arr[]={3,5,6,8,99};
        int k=99;
        int s=b.binary(arr,k);
        System.out.println(s);
    }
}
