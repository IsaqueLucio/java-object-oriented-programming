package interfaces.it_asset_management;

public interface NetworkNode {
    
    String  DEFAULT_GATEWAY = "192.168.1.1";

    String getIpAddress();
    void setIpAddress(String ipAddress);
    void connectToNetwork();

}
