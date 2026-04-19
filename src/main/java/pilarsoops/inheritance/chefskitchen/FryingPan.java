package inheritance.chefskitchen;

public class FryingPan extends Cookware {

    protected boolean isNonStick;

    public FryingPan(String material, int maxTemperature, boolean isNonStick) {
        super(material, maxTemperature);
        this.isNonStick = isNonStick;
    }
    
    public void fry() {
        System.out.println("Frying with the " + material + " frying pan at max temperature of " + maxTemperature + " degrees.");
    }

    @Override
    public String toString() {
        return "FryingPan [material=" + material + ", isNonStick=" + isNonStick + ", maxTemperature=" + maxTemperature
                + "]";
    }

    public boolean isNonStick() {
        return isNonStick;
    }

    public void setNonStick(boolean isNonStick) {
        this.isNonStick = isNonStick;
    }

    

}
