package encapsulation.lego_car_collection;

public class LegoCar {
    
    private int idCode;
    private String color;
    private String model;

    public LegoCar(int idCode, String color, String model) {
        this.idCode = idCode;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "LegoCar [idCode=" + idCode + ", color=" + color + ", model=" + model + "]";
    }

    public int getIdCode() {
        return idCode;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setIdCode(int idCode) {

        if(idCode < 0){
            System.out.println("The ID must to be bigger than zero!");
        } else{
            this.idCode = idCode;
        }

    }

    
    

}