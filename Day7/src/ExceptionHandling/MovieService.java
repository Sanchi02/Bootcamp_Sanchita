package ExceptionHandling;

/**
 * Created by badkass on 7/26/2017.
 */
public class MovieService {
    /*public static void watch(User user) {

    }*/

    public static boolean buyTicket(User user ,double price) throws InvalidPriceException, InvalidAgeException, LowRatingException {
        if (price < 2000.00) {
            InvalidPriceException e = new InvalidPriceException("Price of the ticket cannot be below 2000");
            throw e;
        }
        if (price < 0.00) {
            InvalidPriceException e = new InvalidPriceException("Price cannot be a negative value");
            throw e;
        }
        if (user.getAge() < 0 || user.getAge() >120) {
            InvalidAgeException e = new InvalidAgeException("Age is invalid! Please enter a valid age");
            throw e;
        }
        if (user.getAge() < 10) {
            InvalidAgeException e = new InvalidAgeException("Sorry! You are under age!!");
            throw e;
        }
        if (user.getAge() < 20) {
            InvalidAgeException e = new InvalidAgeException("Sorry! Go home and study!!");
            throw e;
        }
        if (user.getRatings() < 3) {
            LowRatingException e = new LowRatingException("This movie has terrible reviews!!");
            throw e;
        }
        System.out.println("Ticket has been purchased");
        System.out.println();
        return true;
    }
}
