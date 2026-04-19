package aggregationandcomposition.thewildwestgangmixedrelantions;

public class Camp {
    
    private String location;
    private int tentCount;

    protected Camp(String location, int tentCount) {
        this.location = location;
        this.tentCount = tentCount;
    }

    @Override
    public String toString() {
        return "Camp [location=" + location + ", tentCount=" + tentCount + "]";
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTentCount() {
        return tentCount;
    }

    public void setTentCount(int tentCount) {
        this.tentCount = tentCount;
    }

    


}
