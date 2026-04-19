package polymorphism.itbonussystem;

public class Desenvolvedor extends FuncionarioTI{

    private String linguagemPrincipal;

    public Desenvolvedor(String linguagemPrincipal, String nome, double salarioBase){
        super(nome, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public double calcularBonus(){
        return this.salarioBase * 0.20;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

}
