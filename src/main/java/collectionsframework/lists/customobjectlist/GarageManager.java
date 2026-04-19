package collectionsframework.lists.customobjectlist;

import java.util.ArrayList;
import java.util.List;

public class GarageManager {
    
    private List <Car> personalGarage = new ArrayList<>();

    public void addCar(Car car){
        this.personalGarage.add(car);
    }

    public void searchById(String carId){
        for(Car f: personalGarage){
            if(carId.equals(f.getId())){
                System.out.println("Car found!!!\n"+f.toString());
                return;
            } 
        } 

        System.out.println("Car not found in the garage.");
    }


}
