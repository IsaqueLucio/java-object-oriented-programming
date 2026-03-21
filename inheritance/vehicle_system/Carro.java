package inheritance.vehicle_system;

public class Carro extends Veiculo{

    private int quantidadePortas;
    
    public Carro(String marca, String modelo, int ano, int quantidadePortas){
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    public void ligarArCondicionado(){
        System.out.println("Ar condicionado do carro ligado.");
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", quantidadePortas=" + quantidadePortas + ", modelo=" + modelo + ", ano="
                + ano + "]";
    }

}