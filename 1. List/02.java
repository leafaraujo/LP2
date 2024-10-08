import java.text.DecimalFormat;

  
public class Main {
  
  public static void main(String[] args){
    final double SIDE = 8;
    DecimalFormat deci = new DecimalFormat("0.00");
    double perimeter = SIDE * 4;
    double size = SIDE * SIDE;
    System.out.println("ÁREA: " + deci.format(size));
    System.out.println("PERÍMETRO: " + deci.format(perimeter));
    }
  }
