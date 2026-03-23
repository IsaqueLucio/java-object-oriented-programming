package polymorphism.cyberpunk_implants;

public class OpticalCamo extends Cyberware {

    public OpticalCamo(String implantName) {
        super(implantName);
    }
    
    public String activate(){
       return "Activating optical camouflage. You are now invisible.";
    }

    @Override
    public String toString() {
        return "OpticalCamo []";
    }

    

}
