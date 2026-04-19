package abstractclasses.iotsmarthome;

public class SmartBulb extends SmartDevice{

    public SmartBulb(String deviceName) {
        super(deviceName);
    }

    public void turnOn(){
        System.out.println("Turning on the lights and setting color to default white.");
    }

}
