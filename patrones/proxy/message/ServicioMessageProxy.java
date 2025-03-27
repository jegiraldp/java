package proxy.message;

public class ServicioMessageProxy implements iServicioMessage {

    private iServicioMessage theService;
    private iServicioMessage theServiceBinario;
    
    @Override
    public String msg(String persona) {
        return "Proxy: New registry in Log to "+persona;
    }

    public ServicioMessageProxy(){
        this.theService= new SenderMsg();
        this.theServiceBinario=new SenderMsgBinario();
    }

    public iServicioMessage getTheService() {
        return theService;
    }

    public iServicioMessage getTheServiceBinario() {
        return theServiceBinario;
    }

}
