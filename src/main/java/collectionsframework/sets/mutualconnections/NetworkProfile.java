package collectionsframework.sets.mutualconnections;

import java.util.HashSet;
import java.util.Set;

public class NetworkProfile {

    private String username;
    private Set <String> connections = new HashSet<>();

    public NetworkProfile(String username){
        this.username = username;
    }

    public void addConnection(String friendName){
        if(friendName == null){
            System.out.println("The friend username cannot be null!");
            return;
        }
        if(connections.add(friendName)){
            System.out.println("Friend "+friendName+" added successfully to your connection.");
        } else{
            System.out.println("Ignored: The friend "+friendName+" is already in your connection.");
        }
    }

    public String getUsername() {
        return username;
    }

    public Set<String> getConnections() {
        return connections;
    }

    
}
