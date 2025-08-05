package exception.com;

public class InvalidAgeException extends Exception{

    InvalidAgeException(String errorMessage)
    {
        super(errorMessage);

    }
}
