import java.util.Scanner;
// Nesse código, realizei as questões 7-9
public class Main{

  public static void main(String [] args){
    int matrix[][] = new int[3][3], userInput = 0, result = 0;
    Scanner input = new Scanner(System.in);
    
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        System.out.print("Digite o valor da posição [" + i + "][" + j + "]: " );
        matrix[i][j] = input.nextInt();
      }
    }
    
    System.out.println("");
    System.out.println("Sua matriz ficou: ");
    
    for(int i =0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        System.out.printf("%d ", matrix[i][j]);
      }
      System.out.println(" ");
  }
  
  System.out.println(" ");

  System.out.println("Digite a operação que deseja fazer com a sua matriz:");
  System.out.println("--------------------------------");
  System.out.println("1 - Soma da diagonal principal");
  System.out.println("2 - Soma da da parte superior");
  System.out.println("3 - Soma da parte inferior");
  System.out.println("--------------------------------");

  userInput = input.nextInt();
  
  switch (userInput){
    case 1:
      for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
          if(i == j){
            result = result + matrix[i][j];
          }
        }
      }
      break;
    case 2:
      for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
          if(i < j){
            result = result + matrix[i][j];
          }
        }
      }
      break;
    case 3:
      for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
          if(i > j){
            result = result + matrix[i][j];
          }
        }
      }
      break;
    default:
      System.out.println("Opção inválida, encerrando o programa...");
      System.exit(0);
      break;
  }

  System.out.println("O resultado de sua soma é: " + result);
  }
}
