package polymorphism.itbonussystem;

public class FuncionarioTI{
     
    private String nome;
    protected double salarioBase;

    public FuncionarioTI(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularBonus(){
        return this.salarioBase * 0.10;
    }

    @Override
    public String toString() {
        return "\nFuncionarioTI \nnome=" + nome + ", \nsalarioBase=" + salarioBase + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
