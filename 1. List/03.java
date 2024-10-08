import java.text.DecimalFormat;

  
public class Main {
  
  public static void main(String[] args){
    final double RADIUS = 2.8;
    final double PI = 3.14;
    DecimalFormat deci = new DecimalFormat("0.00");
    double perimeter = 2 * PI * RADIUS;
    double size = PI * (RADIUS * RADIUS);
    System.out.println("ÁREA: " + deci.format(size));
    System.out.println("PERÍMETRO: " + deci.format(perimeter));
    }
  }
