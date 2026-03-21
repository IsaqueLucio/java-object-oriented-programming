package encapsulation.home_server_monitoring;

public class TestHomeServer {
    
    public static void main(String[] args) {
        
        HomeServer hm1 = new HomeServer("127.40.809.678", 40, false);
        HomeServer hm2 = new HomeServer("876.27.431.311", 60, true);
        HomeServer hm3 = new HomeServer("734.89.452.005", 80, true);

        System.out.println(hm1);
        System.out.println(hm2);
        System.out.println(hm3);
        
        hm3.setCpuTemperature(90);
    }

}
