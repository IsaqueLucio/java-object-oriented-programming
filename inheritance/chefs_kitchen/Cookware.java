package inheritance.chefs_kitchen;

public class Cookware {
    
    protected String material;
    protected int maxTemperature;
    
    public Cookware(String material, int maxTemperature) {
        this.material = material;
        this.maxTemperature = maxTemperature;
    }

    @Override
    public String toString() {
        return "Cookware [material=" + material + ", maxTemperature=" + maxTemperature + "]";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    

}
