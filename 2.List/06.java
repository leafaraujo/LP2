import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println(" Digite um valor n para calcularmos juntos a sequencia");
    int userInput= input.nextInt(), divisor = 1;
    float patternValue = 1, result = 1;
    if(userInput == 1){
      System.out.println(patternValue);
    }
      
    else{
      System.out.printf("%f + ", patternValue);
      for(int i = 1; i <= userInput; i++){
        for(int j = i; 0 < j; j--){
          divisor = divisor * j;
        }
        if(i == userInput){
          System.out.printf(" = %f", result);
        }
        else{
          patternValue /= divisor;
          System.out.printf("%f + ", patternValue);
          result += patternValue;
          divisor = 1;
        }
      }
    }
  }
}
