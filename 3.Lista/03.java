import java.util.Scanner;

public class Main{

  public static void main(String [] args){
    int matrix[][] = new int[5][5];
    Scanner input = new Scanner(System.in);
    System.out.println("Vamos construir uma matriz 5x5 juntos!");
    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 5; j++){
        System.out.print("Digite o valor na posição [" + i + "][" + j + "]: ");
        matrix[i][j] = input.nextInt();
      }
    }
    System.out.println("");
    System.out.println("Sua matriz ficou: ");
    
    for(int i =0; i <5; i++){
      for(int j = 0; j < 5; j++){
        System.out.printf("%d ", matrix[i][j]);
      }
      System.out.println(" ");
    }
  }
}
