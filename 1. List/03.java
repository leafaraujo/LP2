import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite qual o raio de sua circunferência: ");
    double radius = input.nextDouble();
    final double PI = 3.14;
    DecimalFormat deci = new DecimalFormat("0.00");
    double perimeter = 2 * PI * radius;
    double size = PI * (radius * radius);
    System.out.println("ÁREA: " + deci.format(size));
    System.out.println("PERÍMETRO: " + deci.format(perimeter));
    }
  
}
