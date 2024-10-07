import java.util.Scanner;


public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o número a ser convertido para binário: ");
    int decNum = sc.nextInt();
    if(decNum < 0 || decNum > 32){
      System.out.println("Esse número é inválido!");
    }
    else{
      int binNum = 0;
      int counter = 1;
      while(decNum > 0){
        binNum = binNum + ((decNum % 2) * counter);
        decNum = decNum / 2;
        counter = counter * 10;
      }
      System.out.println("O número em binário é: " + binNum);
    }
  }
  
}
