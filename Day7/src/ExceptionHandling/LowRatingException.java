package ExceptionHandling;

/**
 * Created by badkass on 7/26/2017.
 */
public class LowRatingException extends Exception {
    public LowRatingException() {
    }

    public LowRatingException(String message) {
        super(message);
    }
}
