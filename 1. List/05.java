import java.util.Scanner;

public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    int numOne = sc.nextInt();
    System.out.println("Digite o segundo número: ");
    int numTwo = sc.nextInt();
    int quotient = numOne / numTwo;
    int remainder = numOne % numTwo;
    System.out.println("O quociente da dividão é: " + quotient);
    System.out.println("O resto da divisão é: " + remainder);
  }
  
}
