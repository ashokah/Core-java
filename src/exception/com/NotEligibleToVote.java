package exception.com;

public class NotEligibleToVote extends Exception{

    NotEligibleToVote(String errorMessage)
    {
        super(errorMessage);

    }
}
