import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00");
    float velocityInMS = sc.nextFloat();
    float velocityInKMH = velocityInMS * 3.6f;
    System.out.println("Velocidade em M/S: " + deci.format(velocityInMS));
    System.out.println("Velocidade em KM/H: " + deci.format(velocityInKMH));
    }
  }
