package proxy.message;

public class InicioMessage {

    public static void main(String[] args) {
        SenderMsg theSender = new SenderMsg();
        System.out.println(theSender.msg("PersonaUno"));

        SenderMsgBinario theSenderBinario = new SenderMsgBinario();
        System.out.println(theSenderBinario.msg("PersonaUnoBinario"));

        //with proxy
        ServicioMessageProxy theProxy = new ServicioMessageProxy();
        System.out.println(theProxy.msg("PersonaUno"));

        ServicioMessageProxy theProxyBinario = new ServicioMessageProxy();
        System.out.println(theProxyBinario.msg("PersonaUnoBinario"));


    }
    
}
