import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite a base e altura do seu retângulo, respectivamente: ");
    double base = input.nextDouble();
    double height = input.nextDouble();
    DecimalFormat deci = new DecimalFormat("0.00");
    double perimeter = 2 * (base + height);
    double size = base * height;
    System.out.println("ÁREA: " + deci.format(size));
    System.out.println("PERÍMETRO: " + deci.format(perimeter));
    }
  }
