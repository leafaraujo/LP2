package veiculo;

public class Moto extends Veiculo {

    public Moto(String marca, String modelo, String cor, int ano) {
        super(marca, modelo, cor, ano);
    }

    public void acelerar() {
        System.out.println("VRUUUUUUUUUUUM!");
    }

    public void freiar() {
        System.out.println("SHHHHHHHHHH");
    }

    public void empinar() {
        System.out.println(getModeloDoVeículo() + " está empinando!");
    }

    public void mostrarInformações() {
        super.mostrarInformações();
        System.out.println("Tipo: Moto");
    }
}
