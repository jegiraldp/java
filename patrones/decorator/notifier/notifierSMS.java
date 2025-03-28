package decorator.notifier;

public class notifierSMS extends NotifierDecorator {

    public notifierSMS(iNotifier wrappe) {
        super(wrappe);
        
    }

    @Override
    public void sendNotification(String mailSender, String content) {
        //System.out.println("Msg: "+content+"\nSent to: "+mailSender+" in SMS");
        super.sendNotification(mailSender, addSMS(content));
    }
    
    public String addSMS(String content){
        return content+"_SMS_";
    }
}
