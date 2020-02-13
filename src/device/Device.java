package device;

public interface Device {

    public void enable();
    public void disable();
    public boolean isEnabled();
    public int getVolume();
    public void setVolume(int volume);
    public int getChannel();
    public void setChannel(int channel);

}
