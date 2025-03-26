package bridge.devices;

public class Radio implements iDevice {

    private boolean on=false;
    private int volume=30;
    private int channel = 1;

    @Override
    public void enabled() {
        on = true;
    }

    @Override
    public void disabled() {
       on=false;
    }

    @Override
    public void setVolume(int percent) {
        if(percent>100){
            this.volume=100;
        }else if(percent<0){
            this.volume=0;
        }else{
            this.volume=percent;
        }
    }

    @Override
    public void setChannel(int channel) {
        this.channel=channel;
    }

    @Override
    public void printStatus() {
        System.out.println("I am Radio");
        System.out.println("I am "+ (on ? "enabled":"disabled"));
        System.out.println("Current volume "+this.volume);
        System.out.println("Current channel "+this.channel);
    }

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }
    
}
