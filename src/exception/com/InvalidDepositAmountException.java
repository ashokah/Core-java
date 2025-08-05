package exception.com;

public class InvalidDepositAmountException extends Exception {
    InvalidDepositAmountException(String message)
    {
        super(message);
    }
}
