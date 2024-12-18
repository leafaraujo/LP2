class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println("Valor do ingresso: R$" + valor);
    }
}

class VIP extends Ingresso {
    protected double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVIP() {
        return valor + valorAdicional;
    }

    public void imprimeValorVIP() {
        System.out.println("Valor do ingresso VIP: R$" + getValorVIP());
    }
}

class Normal extends Ingresso {

    public Normal(double valor) {
        super(valor);
    }

    public void imprimeTipo() {
        System.out.println("Ingresso Normal");
    }
}

class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do camarote inferior: " + localizacao);
    }
}


class CamaroteSuperior extends VIP {
    private double valorAdicionalCamarote;

    public CamaroteSuperior(double valor, double valorAdicional, double valorAdicionalCamarote) {
        super(valor, valorAdicional);
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }

    public double getValorCamaroteSuperior() {
        return valor + valorAdicional + valorAdicionalCamarote;
    }

    public void imprimeValorCamaroteSuperior() {
        System.out.println("Valor do ingresso Camarote Superior: R$" + getValorCamaroteSuperior());
    }
}

public class Main {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Normal(50.0);
        ingressoNormal.imprimeValor();
        ((Normal) ingressoNormal).imprimeTipo();

        VIP ingressoVIP = new VIP(50.0, 20.0);
        ingressoVIP.imprimeValorVIP();

        CamaroteInferior ingressoCamaroteInferior = new CamaroteInferior(50.0, 20.0, "Setor A");
        ingressoCamaroteInferior.imprimeLocalizacao();

        CamaroteSuperior ingressoCamaroteSuperior = new CamaroteSuperior(50.0, 20.0, 30.0);
        ingressoCamaroteSuperior.imprimeValorCamaroteSuperior();
    }
}
