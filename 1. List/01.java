import java.text.DecimalFormat;
 
public class Main {
  
  public static void main(String[] args){
    final double BASE = 7.5;
    final double HEIGHT = 12.3;
    DecimalFormat deci = new DecimalFormat("0.00");
    double perimeter = 2 * (BASE + HEIGHT);
    double size = BASE * HEIGHT;
    System.out.println("ÁREA: " + deci.format(size));
    System.out.println("PERÍMETRO: " + deci.format(perimeter));
    }
  }
