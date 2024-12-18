
import java.util.Scanner;

import veiculo.Carro;
import veiculo.Moto;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro veiculo1 = new Carro("Ford", "Mustang", "Preto", 1000000);
        Carro veiculo2 = new Carro("Hyundai", "HB20", "Branco", 32000);
        Moto veiculo3 = new Moto("Yamaha", "Factor", "Vermelha", 15000);
        veiculo1.mostrarInformações();
        veiculo2.mostrarInformações();
        veiculo3.mostrarInformações();
        System.out.println("");
        veiculo1.quebrar();
        veiculo2.fazerDrift();
        veiculo3.empinar();
        System.out.println("");
        System.out.println("Informações atualizadas do veículo 1:");
        veiculo1.mostrarInformações();
        scanner.close();
    }
}
