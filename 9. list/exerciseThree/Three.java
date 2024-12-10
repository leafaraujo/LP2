import budget.*;
import java.util.ArrayList;

public class Three {
    public static void main(String[] args){
        ArrayList<Budget> historico = new ArrayList<Budget>();
        Budget item1 = new Budget("Cimento", 100.00F);
        Budget item2 = new Budget("Areia", 150.00F);
        Budget item3 = new Budget("Tijolo", 300.00F);
        Budget item4 = new Budget("Tinta", 50.0F);
        historico.add(item1);
        historico.add(item2);
        historico.add(item3);
        historico.add(item4);
        ComplexBudget historicoComplexo = new ComplexBudget(historico);
        System.out.println("Valor total: " + historicoComplexo.getValor());
        System.out.println("------------------------------------------");
        Budget achou = historicoComplexo.encontraItem("Tijolo");
        System.out.println("O item: " + achou.getHistorico());
        System.out.println("Seu valor: " + achou.getValor());
        System.out.println("------------------------------------------");
        historicoComplexo.showBudget();
        System.out.println("------------------------------------------");
    }
}
