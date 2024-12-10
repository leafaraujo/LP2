package budget;

public class  Budget {
    private String historico; // historico do item
    private float valor; // valor do item

    
    public Budget() {}

    public Budget(String historico, float valor){
        this.historico = historico;
        this.valor = valor;
    }

    public String getHistorico(){
        return historico;
    }

    public float getValor(){
        return valor;
    }
}
