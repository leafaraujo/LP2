
public class Main {

  public static void main(String[] args){

    for(int i = 1; i <= 10; i++){
      System.out.println("--------------");
      System.out.println("Tabuada do " + i);
      System.out.println("--------------");
      for(int j = 1 ; j <= 10; j++){
        System.out.println(i + " x " + j + " = " + (i * j));
      }
    }
  }
}

      