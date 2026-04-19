package collectionsframework.lists.securityalertfilter;

import java.util.ArrayList;
import java.util.List;

public class AlertMonitor {
    
    private List <SecurityAlert> activeAlerts = new ArrayList<>();

    public void registerAlert(SecurityAlert alert){
        this.activeAlerts.add(alert);
        System.out.println("Alert added to list.");
    }

    public void displayCriticalAlerts(){
        boolean founCritical = false;

        for(SecurityAlert f: activeAlerts){
            if("CRITICAL".equals(f.getSeverity())){
                System.out.println("[CRITICAL THREAT]" + f.getMessage()+".");
                founCritical = true;
            }
        }
      
        if(!founCritical){
            System.out.println("There are no critical alerts.");
        }
        
    }

}
