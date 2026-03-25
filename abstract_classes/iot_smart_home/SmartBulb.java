package abstract_classes.iot_smart_home;

public class SmartBulb extends SmartDevice{

    public SmartBulb(String deviceName) {
        super(deviceName);
    }

    public void turnOn(){
        System.out.println("Turning on the lights and setting color to default white.");
    }

}
