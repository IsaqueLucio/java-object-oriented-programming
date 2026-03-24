package polymorphism.server_workloads;

public class DatabaseServer extends Server {

    public DatabaseServer(String hostName) {
        super(hostName);
    }
    
    @Override
    public String processData(){
        return "Executing complex SQL queries and managing database on "+hostName;
    }

    @Override
    public String toString() {
        return "DatabaseServer []";
    }

}
