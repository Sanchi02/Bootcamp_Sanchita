package SingleResponsibility;

/**
 * Created by badkass on 7/25/2017.
 */
public class Mail {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.sendEmail("admin", "helloworld@xyz.com","Hello World");

    }
}
