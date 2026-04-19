package abstractclasses.iotsmarthome;

public class IoTSmartHomeApp {
    
    public static void main(String[] args) {
        
        SmartBulb smartBulb = new SmartBulb("device1");
        SmartThermostat smartThermostat = new SmartThermostat("device2");

        smartBulb.reboot();
        smartBulb.turnOn();
        smartThermostat.reboot();
        smartThermostat.turnOn();

    }

}
