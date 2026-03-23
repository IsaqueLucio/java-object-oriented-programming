package polymorphism.cyberpunk_implants;

import java.util.ArrayList;
import java.util.List;

public class TestCyberpunkImplants {
    public static void main(String[] args) {
        
        List <Cyberware> cyberwares = new ArrayList<>();

        Cyberware cyberware = new Cyberware("Double jump.");
        MantisBlades mantisBlades = new MantisBlades("Eletric Mantis Blades");
        OpticalCamo opticalCamo = new OpticalCamo("Second Skin");

        cyberwares.add(cyberware);
        cyberwares.add(mantisBlades);
        cyberwares.add(opticalCamo);    

        for(Cyberware f: cyberwares){
            System.out.println("\n"+f.getImplantName()+"\n"+f.activate());
            
        }

    }
}