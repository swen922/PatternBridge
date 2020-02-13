import device.Device;
import device.FMRadio;
import device.TV;
import remote.RemoteControl;

public class App {

    public static void main(String[] args) {
        Device device = new TV();
        RemoteControl remoteControl = new RemoteControl(device);
        remoteControl.togglePower();
        remoteControl.channelUp();
        remoteControl.volumeDown();
        for (int i = 0; i < 100; i++) {
            remoteControl.volumeUp();
        }
        remoteControl.togglePower();

        System.out.println("");

        device = new FMRadio();
        remoteControl.setDevice(device);
        remoteControl.togglePower();
        remoteControl.channelUp();
        remoteControl.volumeDown();
        for (int i = 0; i < 100; i++) {
            remoteControl.volumeUp();
        }
        remoteControl.togglePower();
    }
    
}
