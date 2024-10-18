import java.util.Scanner;



  public class Main{

    public static int[] sortVector(int[] vector){
      int j;
      int key;
      int i;

      for (j = 1; j < vector.length; j++){
        key = vector[j];
        for (i = j - 1; (i >= 0) && (vector[i] > key); i--){
          vector[i + 1] = vector[i];
          }
        vector[i + 1] = key;
        }
      return vector;
    }

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
    int num = 0;

    int vector[] = new int[10];
    System.out.print("Agora digite os elementos (a quantidade deve ser igual a 10): ");
    for(int i = 0; i < 10; i++){
      num = input.nextInt();
      vector[i] = num;
    }
    System.out.print("O vetor é: ");
    vector = sortVector(vector);
    printVector(vector, 10 - 1);
  }
}
      
