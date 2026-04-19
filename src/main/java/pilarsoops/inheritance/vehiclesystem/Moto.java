package inheritance.vehiclesystem;

public class Moto extends Veiculo{

    private boolean temCarenagem;

    public Moto(String marca, String modelo, int ano, boolean temCarenagem){
        super(marca, modelo, ano);
        this.temCarenagem = temCarenagem;
    }

    public void darGrau(){
        System.out.println("Empinando moto!");
    }

    public boolean isTemCarenagem() {
        return temCarenagem;
    }

    public void setTemCarenagem(boolean temCarenagem) {
        this.temCarenagem = temCarenagem;
    }

}