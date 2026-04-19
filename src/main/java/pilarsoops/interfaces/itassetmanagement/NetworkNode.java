package interfaces.itassetmanagement;

public interface NetworkNode {
    
    String  DEFAULTGATEWAY = "192.168.1.1";

    String getIpAddress();
    void setIpAddress(String ipAddress);
    void connectToNetwork();

}
