package bridge.devices;

public class BasicRemote extends Remote {
    private iDevice device;
    private String name;

    public BasicRemote(){}

    public BasicRemote(iDevice device, String name){
        this.device=device;
        this.name=name;
    }

    @Override
    public void power() {
        System.out.println(getClass()+": Power Button Pressed ");
        if(device.isEnabled()){
            device.disabled();
        }else{
            device.disabled();
        }
        
    }

    @Override
    public void volumenDown() {
        System.out.println(getClass()+" Volume Down");
        device.setVolume(device.getVolume()-10);
    }

    @Override
    public void volumenUp() {
        System.out.println(getClass()+" Volume Up");
        device.setVolume(device.getVolume()+10);
    }

    @Override
    public void channelDown() {
        System.out.println(getClass()+" Channel Down");
        device.setChannel(device.getChannel()-1);
    }

    @Override
    public void channelUp() {
        System.out.println(getClass()+" Channel Up");
        device.setChannel(device.getChannel()+1);
    }

    public iDevice getDevice() {
        return device;
    }

    public String getName() {
        return name;
    }

    
    
}
