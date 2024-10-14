import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println(" Digite um valor n para calcularmos juntos a sequencia do fatorial de um numero N");
    int userInput= input.nextInt(), result = 1;
    if(userInput == 0){
      System.out.println(0);
    }
      else if(userInput == 1){
        System.out.println(1);
      }
    else{
      System.out.printf("%d! => ", userInput);
      for(int i = 1; i <= userInput; i++){
        result *= i;
        if(i == userInput){
          System.out.printf("%d = %d", i, result);
        }
        else{
          System.out.printf("%d x ", i);
        }
      }
    }
  }
}
