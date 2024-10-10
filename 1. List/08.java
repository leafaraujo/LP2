import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o valor de raio e altura da sua lata: ");
    double radius = input.nextDouble();
    double height = input.nextDouble();
    final double PI = 3.14;
    DecimalFormat deci = new DecimalFormat("0.000");
    double bulk = PI * (radius * radius) * height;
    System.out.println("RADIUS: " + radius);
    System.out.println("HEIGHT: " + height);
    System.out.println("VOLUME: " + deci.format(bulk));
    }
  }
