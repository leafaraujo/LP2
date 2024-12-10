# Exercícios

## Exercício 1

- Crie uma classe Imóvel, que possui um endereço e um preço.
- Crie uma classe Novo, que herda Imóvel e possui um adicional no preço. Crie métodos de acesso e impressão deste valor adicional.
- Crie uma classe Velho, que herda Imóvel e possui um desconto no preço. Crie métodos de acesso e impressão para este desconto.

## Exercício 2

- Crie uma classe, chamada Ingresso, que possui um valor em reais e um método imprimeValor().
- Crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um método que retorne o valor do ingresso VIP (com o adicional incluído).
- Crie uma classe Normal, que herda Ingresso e possui um método que imprime: "Ingresso Normal".
- Crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos para acessar e imprimir esta localização) e uma classe CamaroteSuperior, que é mais cara (possui valor adicional). Esta última possui um método para retornar o valor do ingresso. Ambas as classes herdam a classe VIP

## Exercício 3

- Dada a classe ItemOrcamento que representa um item de um orçamento, escreva uma classe herdeira de ItemOrcamento denominada ItemOrcamentoComplexo que
mantenha um vetor com subitens de orçamento que podem ser da classe ItemOrcamento ou da classe ItemOrcamentoComplexo. A classe
implementa os seguintes métodos:

Método | O que faz
-------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Construtor | Além dos parâmetros da superclasse, recebe como parâmetro o vetor com os subitens ordenados
getValor | Sobrescreve o método da Superclasse, retornando a soma de valores de todos os subitens de orçamento
encontraItem | Recebe como parâmetro o histórico de um subitem (String) e retorna o objeto correspondente ao subitem que possui este histórico, se existir. Caso contrário, retorna 'null'

Código:

```
public class ItemOrcamento {
    private String historico; // historico do item
    private float valor; // valor do item
    
    public ItemOrcamento(String historico, float valor){
        this.historico = historico;
        this.valor = valor;
    }

    public String getHistorico(){
        return Historico;
    }

    public float getValor(){
        return valor;
    }
}

```

## Exercício 4

- Dadas as classes a seguir, escreva uma classe que representa todas as despesas de um indivíduo. Ela mantém um vetor onde podem ser registradas tanto despesas de um dia (DespesaDia),quanto despesas de um mês (DepesaMes). 

```
public class DespesaMes{
    private int mes; // mes da despesa
    private float valor; // valor da despesa

    public despesaMes(int mes, float valor){
        this.mes = mes;
        this.valor = valor;
    }

    public int getMes(){
        return mes;
    }

    public int getValor(){
        return valor;
    }
}

public class DespesaDia extends DespesaMes{
    private int dia; // dia da despesa;

    public DespesaDia(int dia, int mes, float valor){
        super.(mes, float);
        this.dia = dia
    }

    public int getDia(){
        return dia;
    }
}

```

# Exercício 5

- Dada a seguinte classe que representa os dados de um correntista, mais as despesas previstas para o mesmo

```
public class CorrentistaDespesa extends Correntista {
    private DespesasIndividuo despesasPrevistas; // despesas previstas
    public CorrentistaDespesa(String cpfCliente, float Saldo){
        super(cpfCliente, saldo);
        this.despesasPrevistas = despesas
    }
    public DespesasIndividuo getDespesasPrevistas() {
        return despesasPrevistas;
    }
}
```

- Escreva um método que receba como parâmetro um vetor de objetos da classe CorrentistaDespesa, ESte método deve retornar outro vetor da classe CorrentistaDespesa apenas com aqueles correntistas cujas despesas previstas para março não sejam maiores que o saldo da conta.

*Nesta questão basta implementar o método, não sendo necessária a expecificação da classe*
