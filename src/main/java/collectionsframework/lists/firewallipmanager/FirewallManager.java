package collectionsframework.lists.firewallipmanager;

import java.util.ArrayList;
import java.util.List;

public class FirewallManager {

    private List <String> blockedips = new  ArrayList<>();

    public FirewallManager() {

    }

    public void addIp(String ip){
        blockedips.add(ip);
        System.out.println("IP "+ip+" added to the blocklist.");
    }

    public void removeIp(String ip){
        if(blockedips.contains(ip)){
            blockedips.remove(ip);
            System.out.println("IP "+ip+" successfully removed.");
        } else{
            System.out.println("IP "+ip+" not found in the blocklist.");
        }
    }

    public boolean isBlocked(String ip){
        if(blockedips.contains(ip)){
            return true;
        }
        return false;
    }

    public void displayBlockedIps(){
        if(blockedips.isEmpty()){
            System.out.println("No IPs are currently blocked.");
        }

        for(String f: blockedips){
            System.out.println(f);
        }
    }

}
