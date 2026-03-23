package inheritance.chefs_kitchen;

public class OvenTray extends Cookware {
    
    private String size;

    public OvenTray(String material, int maxTemperature, String size) {
        super(material, maxTemperature);
        this.size = size;
    }

    public void bake() {
        System.out.println("Baking with the " + material + " oven tray at max temperature of " + maxTemperature + " degrees.");
    }

    @Override
    public String toString() {
        return "OvenTray [material=" + material + ", size=" + size + ", maxTemperature=" + maxTemperature + "]";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    

}
