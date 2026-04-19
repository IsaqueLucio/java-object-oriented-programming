package inheritance.vehiclesystem;

public class FrotaApp{
    public static void main(String[] args) {
        Carro car1 = new Carro("Toyota", "Corolla", 2023, 4);
        Moto moto1 = new Moto("Honda", "CB 500", 2022, true);

        car1.ligarMotor();
        moto1.ligarMotor();
        car1.ligarArCondicionado();
        moto1.darGrau();

        System.out.println(car1);
    }
}