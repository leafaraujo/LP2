import java.util.Scanner;

public class Main{

  public static int resultOfProduct(int matrixA[][], int matrixB[][], int positionLine, int positionCollum,  int lenght){
    int result = 0;
    for(int i = 0; i < lenght; i++){
      result += matrixA[positionLine][i] * matrixB[i][positionCollum];
    }
    return result;
  }

  public static void main(String [] args){
    int matrixOne[][] = new int[2][3], matrixTwo[][] = new int[3][2], matrixProduct[][] = new int[2][2];
    Scanner input = new Scanner(System.in);
    System.out.println("Vamos construir uma matriz 2x3 juntos!");
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < 3; j++){
        System.out.print("Digite o valor na posição [" + i + "][" + j + "]: ");
        matrixOne[i][j] = input.nextInt();
      }
    }

    System.out.println("Agora a 3x2!");
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 2; j++){
        System.out.print("Digite o valor na posição [" + i + "][" + j + "]: ");
        matrixTwo[i][j] = input.nextInt();
      }
    }
    System.out.println("Agora vamos multiplicar as matrizes!");

    for(int i = 0; i < 2; i++){
      for(int j = 0; j < 2; j++){
        matrixProduct[i][j] = resultOfProduct(matrixOne, matrixTwo, i, j, 3);
      }
    }
    
    System.out.println("");
    System.out.println("Sua matriz ficou: ");
    
    for(int i =0; i < 2; i++){
      for(int j = 0; j < 2; j++){
        System.out.printf("%d ", matrixProduct[i][j]);
      }
      System.out.println(" ");
    }
  }
}
