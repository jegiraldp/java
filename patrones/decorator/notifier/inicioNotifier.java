package decorator.notifier;

public class inicioNotifier {
    public static void main(String[] args) {
       String email = "jegiraldp@gmail.com";
       String content = "Texto saludo";
    
       System.out.println("\n--- Normal ---");
       notifier n = new notifier(15);
       n.sendNotification(email, content);

       System.out.println("\n--- Decorator ---");
       NotifierDecorator theDecorator = new notifierSMS(new notifierSound(new notifier(16)));
       theDecorator.sendNotification(email, content);
    
    }
    
}
