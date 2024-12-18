package veiculo;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo, String cor, int valor) {
        super(marca, modelo, cor, valor);
    }

    public void acelerar() {
        System.out.println("VRUUUUUUUUUUUM!");
    }

    public void freiar() {
        System.out.println("SHHHHHHHHHH");
    }

    public void quebrar() {
        System.out.println(getModeloDoVeículo() + " quebrou");
        setVeiculoEstaQuebrado(true);
        setPrecoDoVeículo(0);
    }

    public void fazerDrift() {
        System.out.println(getModeloDoVeículo() + " está fazendo drift");
    }

    public void mostrarInformações() {
        super.mostrarInformações();
        System.out.println("Tipo: carro");
    }
}
