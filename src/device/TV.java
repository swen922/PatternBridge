package device;

public class TV implements Device {

    private boolean enabled = false;
    private int volume = 20;
    private final int MAXVOLUME = 100;
    private final int MINVOLUME = 0;
    private int channel = 0;
    private final int MINCHANNEL = 0;


    @Override
    public void enable() {
        this.enabled = true;
        System.out.println("TV is ON! Watch me!");
    }

    @Override
    public void disable() {
        this.enabled = false;
        System.out.println("TV is OFF! Look at nature!");
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = checkVolume(volume);
        System.out.println("TV-volume was set = " + this.volume);

    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int newchannel) {
        this.channel = checkChannel(newchannel);
        System.out.println("TV-channel was set = " + this.channel);

    }

    private int checkVolume(int volume) {
        return volume > MAXVOLUME ? MAXVOLUME : volume < MINVOLUME ? MINVOLUME : volume;
    }

    private int checkChannel(int channel) {
        return channel < MINCHANNEL ? MINCHANNEL : channel;
    }

}
