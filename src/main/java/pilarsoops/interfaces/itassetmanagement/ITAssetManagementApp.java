package interfaces.itassetmanagement;

public class ITAssetManagementApp {
    public static void main(String[] args) {

        Workstation workstation = new Workstation();
        workstation.setIpAddress("197.856.2.1");
        workstation.connectToNetwork();

    }
}
