package inheritance.it_infrastructure;

public class Router extends NetworkDevice{
    
    private String routingProtocol;

    public Router(String ipAdress, String macAdress, String routingProtocol) {
        super(ipAdress, macAdress);
        this.routingProtocol = routingProtocol;
    }

    public void routePacket(){
        System.out.println("Routing packet via "+routingProtocol+".");
    }

    @Override
    public String toString() {
        return "Router [ipAdress=" + ipAdress + ", routingProtocol=" + routingProtocol + ", macAdress=" + macAdress
                + "]";
    }

    public String getRoutingProtocol() {
        return routingProtocol;
    }

    public void setRoutingProtocol(String routingProtocol) {
        this.routingProtocol = routingProtocol;
    }

}
