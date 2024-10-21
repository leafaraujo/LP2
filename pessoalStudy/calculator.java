import java.util.Scanner;

  public class Main{
  
  public static int sum(int a, int b){
    return a + b;  
  }

  public static int sub(int a, int b){
    return a - b;
  }

  public static int mult(int a, int b){
    return a * b;
  }

  public static int div(int a, int b){
    return a/b;
  }
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    char xadrez [][] = new char [8][8];

    for(int i =0; i < 8; i++){
      for(int j = 0; j < 8; j++){
        xadrez[i][j] = '-';
      }
    }
    //System.out.print("Digite a linha em que a torre se encontra: ");
    int numberOne = (int) (Math.random() * 10);
    int numberTwo = (int) (Math.random() * 10);
    int result = 0, userInput = 0;
    System.out.println("---------------------------");
    System.out.println("  CALCULATUS AUTOMATICUS  ");
    System.out.println("---------------------------");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão ");
    System.out.println("---------------------------");
    System.out.println("Qual ação devemos tomar?");
    userInput = input.nextInt();
    switch (userInput){
      case 1:
        result = sum(numberOne, numberTwo);
        System.out.println(numberOne + " + " + numberTwo + " = " + result);
        break;
      case 2:
        result = sub(numberOne, numberTwo);
        System.out.println(numberOne + " - " + numberTwo + " = " + result);
        break;
      case 3:
        result = mult(numberOne, numberTwo);
        System.out.println(numberOne + " * " + numberTwo + " = " + result);
        break;
      case 4: 
        result = div(numberOne, numberTwo);
        System.out.println(numberOne + " / " + numberTwo + " = " + result);
    }
    System.out.println("Acertô, ah mizerávi!");
  }
}
