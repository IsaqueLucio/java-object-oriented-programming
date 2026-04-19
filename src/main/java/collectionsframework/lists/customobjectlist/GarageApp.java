package collectionsframework.lists.customobjectlist;

public class GarageApp {
    public static void main(String[] args) {
        
        GarageManager garageManager = new GarageManager();

        Car car1 = new Car("Mustang Shelby 500", "Ford", "101-A");
        Car car2 = new Car("GT3 RS", "Porshe", "102-A");
        Car car3 = new Car("Utopia", "Pagani", "103-A");

        garageManager.addCar(car1);
        garageManager.addCar(car2);
        garageManager.addCar(car3);
        
        garageManager.searchById("104-A");
        garageManager.searchById("101-A");

    }
}
