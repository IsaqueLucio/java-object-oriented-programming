package polymorphism.serverworkloads;

import java.util.ArrayList;
import java.util.List;

public class ServerWorkLoadsApp {
    
    public static void main(String[] args) {
        
        List <Server> listServer= new ArrayList<>();
        
        Server server = new Server("AWS");
        DatabaseServer databaseServer = new DatabaseServer("LocalHost");
        WebUiServer webUiServer = new WebUiServer("amazon.com");

        listServer.add(server);
        listServer.add(databaseServer);
        listServer.add(webUiServer);

        for(Server f: listServer){
            System.out.println("\n"+f.getHostName()+"\n"+f.processData());
        }

    }
}
