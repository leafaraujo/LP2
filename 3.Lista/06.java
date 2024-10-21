import java.util.Scanner;

public class Main{

  public static void main(String [] args){
    int matrix[][] = new int[5][5];
    Scanner input = new Scanner(System.in);
    
    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 5; j++){
        if(i == j){
          matrix[i][j] = 1;
        }
        else{
          matrix[i][j] = 0;
        }
      }
    }
    
    System.out.println("");
    System.out.println("Sua matriz ficou: ");
    
    for(int i =0; i < 5; i++){
      for(int j = 0; j < 5; j++){
        System.out.printf("%d ", matrix[i][j]);
      }
      System.out.println(" ");
    }
  }
}
