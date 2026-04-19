package inheritance.chefskitchen;

public class ChefsKitchenApp{
    public static void main(String[] args) {

        OvenTray ovenTray = new OvenTray("aluminum", 450, "large");
        FryingPan fryingPan = new FryingPan("cast iron", 500, true);

        System.out.println(ovenTray);
        ovenTray.bake();

        System.out.println(fryingPan);
        fryingPan.fry();
        
    }
    
}
