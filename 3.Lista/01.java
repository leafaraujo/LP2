import java.util.Scanner

 public class Main{

    public static void printVector(int[] vector, int lenght){
      System.out.print("[");
      for(int i = lenght; i >= 0; i--){
        if(i == 0){
          System.out.println(vector[i] + "]");
        }
        else{
          System.out.printf("%d, ", vector[i]);
        }
      }
    }
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int vectorSize = 0, num = 0;
    System.out.print("Insira o tamanho do vetor: ");
    vectorSize = input.nextInt();
    int vector[] = new int[vectorSize];
    System.out.print("Agora digite os elementos (a quantidade deve ser igual a " + vectorSize + "): ");
    for(int i = 0; i < vectorSize; i++){
      num = input.nextInt();
      vector[i] = num;
    }
    System.out.print("O vetor é: ");
    printVector(vector, vectorSize - 1);
  }
 }
