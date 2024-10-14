import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o ano que eu verifico se ele é bissexto");
    int year = input.nextInt();
    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
      System.out.println("O ano é bissexto!");
    }
    else{
      System.out.println("O ano não é bissexto!");
    }
  }
}
