package polymorphism.cyberpunk_implants;

public class Cyberware {
    
    protected String implantName;

    public Cyberware(String implantName) {
        this.implantName = implantName;
    }

    public String activate(){
        return "Activating generic cyberware.";
    }

    @Override
    public String toString() {
        return "Cyberware [implantName=" + implantName + "]";
    }

    public String getImplantName() {
        return implantName;
    }

    public void setImplantName(String implantName) {
        this.implantName = implantName;
    }

    

}
