package decorator.notifier;

public abstract class NotifierDecorator implements iNotifier {

    private iNotifier wrappe;

    public NotifierDecorator(iNotifier wrappe) {
        this.wrappe = wrappe;
    }

    @Override
    public void sendNotification(String mailSender, String content) {
        wrappe.sendNotification(mailSender, content);
    }
    
}
