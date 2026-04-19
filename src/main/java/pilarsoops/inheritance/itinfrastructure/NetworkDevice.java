package inheritance.itinfrastructure;

public class NetworkDevice {
    
    protected String ipAdress;
    protected String macAdress;

    public NetworkDevice(String ipAdress, String macAdress) {
        this.ipAdress = ipAdress;
        this.macAdress = macAdress;
    }

    public void checkStatus(){
        System.out.println("Device "+this.ipAdress+" is online.");
    }

    @Override
    public String toString() {
        return "NetworkDevice [ipAdress=" + ipAdress + ", macAdress=" + macAdress + "]";
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public String getMacAdress() {
        return macAdress;
    }

    public void setMacAdress(String macAdress) {
        this.macAdress = macAdress;
    }

    
}
