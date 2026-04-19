package inheritance.itinfrastructure;

public class ITInfrastructureApp {
    
    public static void main(String[] args) {
        
        Router router1 = new Router("192.168.0.1", "0:1A:2B:3C:4D:5E", "A9");
        Switch switch1 = new Switch("192.168.0.2", "A1:B2:C3:D4:E5:F6", 48);

        router1.checkStatus();
        switch1.checkStatus();
        router1.routePacket();
        switch1.openPort();

    }

}
