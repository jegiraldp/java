package bridge.devices;

public interface iDevice {
    boolean isEnabled();
    void enabled();
    void disabled();
    void setVolume(int percent);
    void setChannel(int channel);
    int getVolume();
    int getChannel();
    void printStatus();

        
}
