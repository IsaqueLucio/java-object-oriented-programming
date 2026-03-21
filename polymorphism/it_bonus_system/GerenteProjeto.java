package polymorphism.it_bonus_system;

public class GerenteProjeto extends FuncionarioTI{
    
    private int projetosEntregues;

    public GerenteProjeto(String nome, double salarioBase, int projetosEntregues) {
        super(nome, salarioBase);
        this.projetosEntregues = projetosEntregues;
    }
    
    @Override
    public double calcularBonus(){
        return ((this.salarioBase*0.30)+(this.projetosEntregues*100));
    }

    public int getProjetosEntregues() {
        return projetosEntregues;
    }

    public void setProjetosEntregues(int projetosEntregues) {
        this.projetosEntregues = projetosEntregues;
    }

}