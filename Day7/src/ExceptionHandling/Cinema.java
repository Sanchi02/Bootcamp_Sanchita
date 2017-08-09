package ExceptionHandling;

/**
 * Created by badkass on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        /*a) user age is invalid (different one)
        b) user age is less then 10 (different one)
        c) user age is less then 20 (different one)
        d) user rating is below 3*/
        User u1 = new User(234,"Ramesh", 30,2);
        User u2 = new User(432,"Suresh", 3,7);
        User u3 = new User(432342,"Suresh", 16,2);
        User u4 = new User(43234,"Suresh", 45,7);

        try {
           // MovieService.buyTicket(u1,20);
            MovieService.buyTicket(u2,3000);
            MovieService.buyTicket(u3,3645);
            MovieService.buyTicket(u4,4000);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        } catch (LowRatingException e) {
            System.out.println(e.getMessage());
        }



    }
}
