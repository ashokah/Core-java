public class ElementsOfArray {
    public static void main(String[] args)
    {
        int arr[]= {1,2,3,4,5};
        // print the elements of the array
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // print the elements of the array in reverse order
        for(int i =arr.length-1;i>=0;i--)
        {
            System.out.print( arr[i]+  "\t" );
        }
    }
}
