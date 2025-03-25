package facade.domotic;

public class InicioDomotic {

    public static void main(String[] args) {
        DeviceControl dc = new DeviceControl();
        dc.onCamera();
        dc.detailsCamera();
        dc.onLamp();
        dc.detailsLamp();
        System.out.println("///////////");
        dc.offCamera();
        dc.offLamp();
    }
    
}
