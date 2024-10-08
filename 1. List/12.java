import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00");
    float R1 = sc.nextFloat();
    float R2 = sc.nextFloat();
    float R3 = (R1 * R2) / (R1 + R2);
    System.out.println("R1: " + deci.format(R1));
    System.out.println("R2: " + deci.format(R2));
    System.out.println("R3: " + deci.format(R3));
    }
  }
