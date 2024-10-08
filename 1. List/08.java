import java.text.DecimalFormat;

  
public class Main {
  
  public static void main(String[] args){
    final double RADIUS = 2.6;
    final double HEIGHT = 22.1;
    final double PI = 3.14159;
    DecimalFormat deci = new DecimalFormat("0.000");
    double bulk = PI * (RADIUS * RADIUS) * HEIGHT;
    System.out.println("RADIUS: " + RADIUS);
    System.out.println("HEIGHT: " + HEIGHT);
    System.out.println("VOLUME: " + deci.format(bulk));
    }
  }
