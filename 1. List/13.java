import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00");
    int timeInTrip = sc.nextInt();
    float velocityAverage = sc.nextFloat();
    float distance = timeInTrip * velocityAverage;
    System.out.println("Tempo de viagem: " + deci.format(timeInTrip));
    System.out.println("Velocidade média em KM/H: " + deci.format(velocityAverage));
    System.out.println("A distância percorrida foi de: " + deci.format(distance) + " KM.");
    }
  }
