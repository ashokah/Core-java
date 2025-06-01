public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 15;
        int b = 8;
        //Bitwise And
        System.out.println(a & b);

        //Bitwise Or
        System.out.println(a | b);

        //Bitwise Xor
        System.out.println(a ^ b);

        //right shift
        System.out.println(a >> 1);
        System.out.println(b >> 1);

        System.out.println(a >> 3);
        System.out.println(b >> 2);
        System.out.println("the right filling zero");
        System.out.println(a >>> 2);

        // right shift filling zero
        int x = 10;
        System.out.println(x >>> 2);

        //left shift
        System.out.println(a << 1);
        System.out.println(b << 1);
    }
}
