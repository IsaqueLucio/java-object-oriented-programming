package abstract_classes.iot_smart_home;

public abstract class SmartDevice {
    
    protected String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public void reboot(){
        System.out.println("Rebooting "+deviceName+"...");
    }

    public abstract void turnOn();

}
