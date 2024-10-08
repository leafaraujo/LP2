import java.util.Scanner;
import java.text.DecimalFormat;

  
public class Main {
  
  public static void main(String[] args){
    final double SIDE = 2.6;
    Scanner sc = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00");
    double perimeter = SIDE * 3;
    System.out.println("LADO: " + SIDE);
    System.out.println("PERÍMETRO: " + deci.format(perimeter));
    }
  }
