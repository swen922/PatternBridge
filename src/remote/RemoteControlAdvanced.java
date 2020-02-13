package remote;

import device.Device;

public class RemoteControlAdvanced extends RemoteControl {

    public RemoteControlAdvanced(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }

}
