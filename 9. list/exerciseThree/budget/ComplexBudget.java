package budget;
import java.util.ArrayList;

public class ComplexBudget extends Budget{
    ArrayList<Budget> orcamento = new ArrayList<Budget>();

    public ComplexBudget(ArrayList<Budget> orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public float getValor(){
        float valor = 0;
        for (int i = 0; i < orcamento.size(); i++) {
            valor += orcamento.get(i).getValor();
        }
        return valor;
    }

    public void showBudget(){
        System.out.println("Orçamento completo:");
        System.out.println("---------------------------------");
        for (int i = 0; i < orcamento.size(); i++) {
            System.out.println("Item: " + orcamento.get(i).getHistorico());
            System.out.println("Valor: " + orcamento.get(i).getValor());
            System.out.println("---------------------------------");
        }
    }

    public Budget encontraItem(String histórico){
        for(int i = 0; i < orcamento.size(); i++){
            if(histórico == orcamento.get(i).getHistorico()){
                return orcamento.get(i);
            }
        }
        return null;
    }
}
