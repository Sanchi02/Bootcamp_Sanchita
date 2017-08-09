/**
 * Created by badkass on 7/28/2017.
 */
public class MessageService {
    public static void send(String s, IMessageSender iMessageSender) {
        iMessageSender.sendMessage(s);
    }
}
