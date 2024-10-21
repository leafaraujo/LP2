import java.util.Scanner;

public class Main{

  public static void main(String [] args){
    char chess[][] = new char[8][8]; 
    int line = 0, collum = 0, counterLine = 1, counterCollum = 1;
    Scanner input = new Scanner(System.in);

    System.out.print("Digite a linha em que a torre se encontra: ");
    line = input.nextInt();
    System.out.print("Digite a coluna em que a torre se encontra: ");
    collum = input.nextInt();
    for(int i = 0; i < 8; i++){
      for(int j =0; j < 8; j++){
        if(i == (line - 1) || j == (collum - 1)){
          chess[i][j] = 'x';
        }
        else{
          chess[i][j] = '-';
        }
      }
    }
    
    for(int i = -2; i < 8; i++){
      for(int j = -2; j < 8; j++){
        if(i == -2 && j == -2){
          System.out.print(" ");
        }
        else if(i == -2){
          System.out.print(" " + counterLine + " ");
          counterLine ++;
        }
        else if(j == -2){
          System.out.print(counterCollum);
          counterCollum ++;
        }
        else if(i == -1 && j == -1){
          System.out.print(" ");
        }
        else if(i == -1){
          System.out.print("---");
        }

        else if(j == -1){
          System.out.print("|");
          }
        else{
          System.out.printf(" " + chess[i][j] + " ");
        }
      }
      System.out.println(" ");
    }
  }
}
