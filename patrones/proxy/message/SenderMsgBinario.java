package proxy.message;

public class SenderMsgBinario implements iServicioMessage {

    @Override
    public String msg(String persona) {
        return "Wellcome "+persona;
    }
    
}
