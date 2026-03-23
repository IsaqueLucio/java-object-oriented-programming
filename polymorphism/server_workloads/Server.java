package polymorphism.server_workloads;

public class Server {
    
    protected String hostName;

    public Server(String hostName) {
        this.hostName = hostName;
    }

    public String processData(){
        return "Processing standard data packets on "+hostName;
    }

    @Override
    public String toString() {
        return "Server [hostName=" + hostName + "]";
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    

}
