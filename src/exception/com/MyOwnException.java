package exception.com;

public class MyOwnException extends Exception {
    MyOwnException(String message)
    {

        super(message);
    }
    public static void main(String[] args) throws MyOwnException {
        int a=100;
        if(a>10)
        {
            throw new MyOwnException("my exception");
        }


    }
}
