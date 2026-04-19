package aggregationandcomposition.thewildwestgangmixedrelantions;

public class Outlaw {
    
    private String name;
    private double bounty;
    
    public Outlaw(String name, double bounty) {
        this.name = name;
        this.bounty = bounty;
    }

    @Override
    public String toString() {
        return "Outlaw [name=" + name + ", bounty=" + bounty + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBounty() {
        return bounty;
    }

    public void setBounty(double bounty) {
        this.bounty = bounty;
    }

    

}
