package inheritance.itinfrastructure;

public class Switch extends NetworkDevice{
    
    private int porCount;

    public Switch(String ipAdress, String macAdress, int porCount) {
        super(ipAdress, macAdress);
        this.porCount = porCount;
    }

    public void openPort(){
        System.out.println("Opening one of the "+porCount+" ports.");
    }

    @Override
    public String toString() {
        return "Switch [ipAdress=" + ipAdress + ", porCount=" + porCount + ", macAdress=" + macAdress
                + ", getPorCount()=" + getPorCount() + "]";
    }

    public int getPorCount() {
        return porCount;
    }

    public void setPorCount(int porCount) {
        this.porCount = porCount;
    }

    
}
