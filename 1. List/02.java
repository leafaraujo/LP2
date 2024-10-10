import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite qual o lado do quadrado: ");
    double side = input.nextDouble();
    DecimalFormat deci = new DecimalFormat("0.00");
    double perimeter = side * 4;
    double size = side * side;
    System.out.println("ÁREA: " + deci.format(size));
    System.out.println("PERÍMETRO: " + deci.format(perimeter));
  }
}
