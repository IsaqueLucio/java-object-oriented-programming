package collectionsframework.lists.firewallipmanager;

public class FirewallApp {
    public static void main(String[] args) {
        
        FirewallManager firewallManager = new FirewallManager();

        firewallManager.displayBlockedIps();

        firewallManager.addIp("192.168.1.50");
        firewallManager.addIp("10.0.0.5");
        firewallManager.addIp("172.16.254.1");

        firewallManager.displayBlockedIps();

        System.out.println(firewallManager.isBlocked("192.168.1.50"));
        System.out.println(firewallManager.isBlocked("192.156.8.89"));

        firewallManager.removeIp("172.16.254.1");

        firewallManager.displayBlockedIps();
        
    }
}
