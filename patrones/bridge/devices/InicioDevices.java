package bridge.devices;

public class InicioDevices {

    public static void main(String[] args) {
        System.out.println("Testing Basic Remote");
        Radio r = new Radio();
        BasicRemote br = new BasicRemote(r," Basic Remote");
        br.power();
        br.volumenUp();
        br.channelUp();
        r.printStatus();

        System.out.println("\n-----\nTesting Advance Remote");
        Television tv = new Television();
        AdvanceRemote ar = new AdvanceRemote(tv," Advance Remote");
        ar.power();
        ar.volumenUp();
        ar.channelUp();
        tv.printStatus();

    }
    
}
