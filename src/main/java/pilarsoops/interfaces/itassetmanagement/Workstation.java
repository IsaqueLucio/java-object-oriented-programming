package interfaces.itassetmanagement;

public class Workstation implements NetworkNode {

    private String ipAddress;

    public Workstation() {

    }

    @Override
    public void connectToNetwork(){
        System.out.println("Workstation connected to gateway " + DEFAULTGATEWAY + " with IP " + this.ipAddress);
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    
    
}
