package collectionsframework.lists.customobjectlist;

public class Car {
    
    private String model;
    private String brand;
    private String id;
    
    public Car(String model, String brand, String id) {
        this.model = model;
        this.brand = brand;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", brand=" + brand + ", id=" + id + "]";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
