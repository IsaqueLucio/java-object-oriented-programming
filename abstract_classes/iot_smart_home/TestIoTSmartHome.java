package abstract_classes.iot_smart_home;

public class TestIoTSmartHome {
    
    public static void main(String[] args) {
        
        SmartBulb smartBulb = new SmartBulb("device1");
        SmartThermostat smartThermostat = new SmartThermostat("device2");

        smartBulb.reboot();
        smartBulb.turnOn();
        smartThermostat.reboot();
        smartThermostat.turnOn();

    }

}
