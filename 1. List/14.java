import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    int numOne = sc.nextInt();
    System.out.println("Digite o segundo número: ");
    int numTwo = sc.nextInt();
    System.out.println("\n");
    System.out.println("Variáveis com números normais: ");
    System.out.println("Primeiro número: " + numOne);
    System.out.println("Segundo número: " + numTwo);
    numOne = (numOne * numTwo);
    numTwo = (numOne / numTwo);
    numOne = (numOne / numTwo);
    System.out.println("\n");
    System.out.println("Variáveis com números invertidos: ");
    System.out.println("Primeiro número: " + numOne);
    System.out.println("Segundo número: " + numTwo);
    }

}
