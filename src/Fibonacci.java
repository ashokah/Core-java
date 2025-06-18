public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int x=0;
        int y=1;
        int k=0;
        for(int i=1;i<=n;i++){
            System.out.print(x+" , ");
            k=x+y;
            x=y;
            y=k;
        }
    }
}
