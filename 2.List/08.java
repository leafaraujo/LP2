import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println(" Digite um valor N para calcularmos todos seus divisores: ");
    int userInput = input.nextInt();
    System.out.print("Divisores: ");
    for(int i = 1; i <= userInput; i++){
      if((userInput % i) == 0){
        if(i == userInput){
          System.out.print(i + ".");
        }
        else{
        System.out.print(i + ", ");
        }
      }
    }
  }
}
      
