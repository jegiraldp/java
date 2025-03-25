package facade.domotic;

public class DeviceControl {

    private iDevice camera;
    private iDevice lamp;

    public DeviceControl() {
        camera = new Camera(01, "Room");
        lamp = new Lamp(02, "Door");
    }

    public void onCamera(){
        camera.on();
    }
    public void offCamera(){
        camera.off();
    }

    public void detailsCamera(){
        camera.viewDetails();
    }
    public void onLamp(){
        lamp.on();
    }
    public void offLamp(){
        lamp.off();
    }
    public void detailsLamp(){
        lamp.viewDetails();
    }
    
    
}
