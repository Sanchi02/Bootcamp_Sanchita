/**
 * Created by badkass on 7/28/2017.
 */
public class MessageSenderDemo {
    public static void main(String[] args) {
        MessageService.send("Hi from Whatsapp",(String s) -> {
            System.out.printf("Message service: %s%n", s);
        });

        MessageService.send("Hi from Email",(String s) -> {
            System.out.printf("Message service: %s%n", s);
        });

        MessageService.send("Hi from Sms",(String s) -> {
            System.out.printf("Message service: %s", s);
        });
    }
}
