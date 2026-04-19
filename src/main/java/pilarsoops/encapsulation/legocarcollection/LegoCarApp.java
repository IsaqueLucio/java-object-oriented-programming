package encapsulation.legocarcollection;

public class LegoCarApp {
    public static void main(String[] args) {

        LegoCar Lc1 = new LegoCar(1,"Red", "Ferrari SF90");
        Lc1.setIdCode(-3);
        System.out.println("Actual ID: "+Lc1.getIdCode());

    }

}
