package polymorphism.cyberpunk_implants;

public class MantisBlades extends Cyberware {

    public MantisBlades(String implantName) {
        super(implantName);
    }
    
    public String activate(){
        return "Deploying arm blades for melee combat!";
    }

    @Override
    public String toString() {
        return "MantisBlades []";
    }

    

}
