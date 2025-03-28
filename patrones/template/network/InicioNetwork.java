package template.network;

public class InicioNetwork {

    public static void main(String[] args) {
        Network nt = null;
        String userName="jegiraldp";
        String password="123";

        System.out.println("---Post in Facebook---");
        nt= new Facebook(userName, password);
        nt.post("Message");
        
        System.out.println("\n---Post in WhatsApp---");
        nt= new WhatsApp(userName, password);
        nt.post("Message");

    }
    
}
