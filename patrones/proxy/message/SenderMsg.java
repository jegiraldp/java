package proxy.message;

public class SenderMsg implements iServicioMessage {

    @Override
    public String msg(String persona) {
        return "Wellcome "+persona;
    }
    
}
