package polymorphism.cyberpunkimplants;

public class OpticalCamo extends Cyberware {

    public OpticalCamo(String implantName) {
        super(implantName);
    }
    
    @Override
    public String activate(){
       return "Activating optical camouflage. You are now invisible.";
    }

    @Override
    public String toString() {
        return "OpticalCamo []";
    }

    

}
