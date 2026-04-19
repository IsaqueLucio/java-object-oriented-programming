package encapsulation.homeservermonitoring;

public class HomeServer{

    private String ipAddress;
    private double cpuTemperature;
    private boolean isOnline;

    public HomeServer(String ipAddress, double cpuTemperature, boolean isOnline) {
        this.ipAddress = ipAddress;
        this.cpuTemperature = cpuTemperature;
        this.isOnline = isOnline;
    }

    @Override
    public String toString() {
        return "\nHomeServer \nIP Address: " + ipAddress + " \nCPU Temperature: " + cpuTemperature + " \nIs Online: " + isOnline
                +"\n";
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public double getCpuTemperature() {
        return cpuTemperature;
    }

    public void setCpuTemperature(double cpuTemperature) {
        if(cpuTemperature > 85.0){
            System.out.println("\nWARNING: Server "+ipAddress+" is overheating! Temp: "+cpuTemperature+"°C");
        }
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }
    
}
