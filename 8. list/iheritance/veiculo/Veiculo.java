package veiculo;

public class Veiculo extends java.lang.Object {
    private String marcaDoVeículo;
    private String modeloDoVeículo;
    private String corDoVeículo;
    private int precoDoVeículo;
    private boolean veiculoEstaQuebrado = false;

    public Veiculo(String marca, String modelo, String cor, int valor) {
        super();
        this.marcaDoVeículo = marca;
        this.modeloDoVeículo = modelo;
        this.corDoVeículo = cor;
        this.precoDoVeículo = valor;
    }

    public void mostrarInformações() {
        System.out.println("------------------------");
        System.out.println("Modelo: " + modeloDoVeículo);
        System.out.println("Marca: " + marcaDoVeículo);
        System.out.println("Cor: " + corDoVeículo);
        System.out.println("Valor: " + precoDoVeículo + ",00");
        if (!veiculoEstaQuebrado) {
            System.out.println("Estado: Normal");
        } else {
            System.out.println("Estado: Quebrado");
        }
    }

    public String getMarcaDoVeículo() {
        return marcaDoVeículo;
    }

    public void setMarcaDoVeículo(String marcaDoVeículo) {
        this.marcaDoVeículo = marcaDoVeículo;
    }

    public String getModeloDoVeículo() {
        return modeloDoVeículo;
    }

    public void setModeloDoVeículo(String modeloDoVeículo) {
        this.modeloDoVeículo = modeloDoVeículo;
    }

    public String getCorDoVeículo() {
        return corDoVeículo;
    }

    public void setCorDoVeículo(String corDoVeículo) {
        this.corDoVeículo = corDoVeículo;
    }

    public int getPrecoDoVeículo() {
        return precoDoVeículo;
    }

    public void setPrecoDoVeículo(int precoDoVeículo) {
        this.precoDoVeículo = precoDoVeículo;
    }

    public boolean isVeiculoEstaQuebrado() {
        return veiculoEstaQuebrado;
    }

    public void setVeiculoEstaQuebrado(boolean veiculoEstaQuebrado) {
        this.veiculoEstaQuebrado = veiculoEstaQuebrado;
    }
}
