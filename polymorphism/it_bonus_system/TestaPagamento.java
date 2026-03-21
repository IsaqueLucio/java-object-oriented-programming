package polymorphism.it_bonus_system;

import java.util.ArrayList;
import java.util.List;

public class TestaPagamento{
    public static void main(String[] args) {

        List<FuncionarioTI> folhaPagamento = new ArrayList<>();

        FuncionarioTI fun1 = new FuncionarioTI("Suporte Técnico", 2000);
        Desenvolvedor dev1 = new Desenvolvedor("Java", "Arthur", 5000);
        GerenteProjeto gerPro1 = new GerenteProjeto("Dutch", 8000, 5);

        folhaPagamento.add(gerPro1);
        folhaPagamento.add(dev1);
        folhaPagamento.add(fun1);

        for(FuncionarioTI f: folhaPagamento){
            System.out.println(f.getNome()+"\n"+f.calcularBonus()+"\n");
        }

    }
    
}