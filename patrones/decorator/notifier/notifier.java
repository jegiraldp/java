package decorator.notifier;

public class notifier implements iNotifier {
    @SuppressWarnings("unused")
    private int code;

    public notifier(int code) {
        this.code = code;
    }

    @Override
    public void sendNotification(String mailSender, String content) {
        System.out.println("Msg: "+content+"\nSent to: "+mailSender);
    }
    
}
