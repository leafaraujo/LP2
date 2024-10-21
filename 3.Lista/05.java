import java.util.Scanner;

public class Main{

  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int userInput = 0;
    System.out.print("Digite a quantidade de termos do triangulo de Pascal: ");
    userInput = input.nextInt();
    int pascalTriangle[][] = new int[userInput][userInput];

    for(int i = 0; i < userInput; i++){
      for(int j = 0; j < userInput; j++){
        if(j == 0 || j == i){
          pascalTriangle[i][j] = 1;
        }
        else if(j > i){
          pascalTriangle[i][j] = 0;
        }
        else{
          pascalTriangle[i][j] = (pascalTriangle[i-1][j -1]) + (pascalTriangle[i-1][j]);
        }
      }
    }

    for(int i = 0; i < userInput; i++){
      for(int j = 0; j < userInput; j++){
        if(pascalTriangle[i][j] != 0){
        System.out.print(pascalTriangle[i][j] + " ");
        }
      }
      System.out.println(" ");
    }

  }
}
