package remote;

import device.Device;

public class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        }
        else {
            device.enable();
        }
    }

    public void volumeUp() {
        int vol = device.getVolume();
        vol++;
        device.setVolume(vol);
    }

    public void volumeDown() {
        int vol = device.getVolume();
        vol--;
        device.setVolume(vol);
    }

    public void channelUp() {
        int ch = device.getChannel();
        ch++;
        device.setChannel(ch);
    }

    public void channelDown() {
        int ch = device.getChannel();
        ch--;
        device.setChannel(ch);
    }

}

