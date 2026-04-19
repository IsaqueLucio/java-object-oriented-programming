package abstractclasses.iotsmarthome;

public class SmartThermostat extends SmartDevice {

    public SmartThermostat(String deviceName) {
        super(deviceName);
    }

    public void turnOn(){
        System.out.println("Turning on HVAC and setting temperature to 22°C.");
    }

}
