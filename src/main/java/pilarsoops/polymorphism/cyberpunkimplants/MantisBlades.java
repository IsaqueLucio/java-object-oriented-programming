package polymorphism.cyberpunkimplants;

public class MantisBlades extends Cyberware {

    public MantisBlades(String implantName) {
        super(implantName);
    }
    
    @Override
    public String activate(){
        return "Deploying arm blades for melee combat!";
    }

    @Override
    public String toString() {
        return "MantisBlades []";
    }

    

}
