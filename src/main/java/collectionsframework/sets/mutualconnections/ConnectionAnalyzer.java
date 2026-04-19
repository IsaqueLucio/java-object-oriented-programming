package collectionsframework.sets.mutualconnections;

import java.util.HashSet;
import java.util.Set;

public class ConnectionAnalyzer {
    
    public void findMutualConnections(NetworkProfile user1, NetworkProfile user2){

        //make a new hashSet to do not change nothing in the original hashSet
        Set<String> mutuals = new HashSet<>(user1.getConnections());

        //when we use the ".retainAll", all the elements that are not common between
        //themselves are deleted, remaining only the common elements
        mutuals.retainAll(user2.getConnections());

        //now, if there no elements remaing after the ".retainAll", nothing will remaining in the hasSet
        //so we use the ".isEmpty" to see, if return true, there no common connections, if return false
        //thew is showed the common results
        if(mutuals.isEmpty()){
            System.out.println("No mutual connections found bethwen the user "
                +user1.getUsername()+" and the user "+user2.getUsername());
        } else{
            System.out.println("These are the common connections between "+user1.getUsername()+" and "+user2.getUsername()+":");
            for(String f: mutuals){
                System.out.println(f);
            }
        }

    }

}
