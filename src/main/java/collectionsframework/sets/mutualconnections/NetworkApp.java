package collectionsframework.sets.mutualconnections;

public class NetworkApp {
    public static void main(String[] args) {
        
        NetworkProfile networkProfile = new NetworkProfile("Arthur");
        NetworkProfile networkProfile2 = new NetworkProfile("Osea");
        ConnectionAnalyzer connectionAnalyzer = new ConnectionAnalyzer();

        connectionAnalyzer.findMutualConnections(networkProfile, networkProfile2);

        System.out.println("\n");

        networkProfile.addConnection("Heitor");
        networkProfile.addConnection("Nickolas");
        networkProfile.addConnection("Kauã");
        networkProfile.addConnection("Kauã");
        networkProfile.addConnection("Elisa");
        networkProfile.addConnection("Ana");

        networkProfile2.addConnection("Michael");
        networkProfile2.addConnection("Edward");
        networkProfile2.addConnection("Elisa");
        networkProfile2.addConnection(null);
        networkProfile2.addConnection("Sarah");
        networkProfile2.addConnection("Nickolas");
        networkProfile2.addConnection("Ana");

        System.out.println("\n");

        connectionAnalyzer.findMutualConnections(networkProfile, networkProfile2);

    }
}
