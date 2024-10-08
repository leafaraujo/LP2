import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00");
    float length = sc.nextFloat();
    float width = sc.nextFloat();
    float height = sc.nextFloat();
    float bulk = length * width * height;
    System.out.println("Comprimento: " + deci.format(length));
    System.out.println("Largura: " + deci.format(width));
    System.out.println("Altura: " + deci.format(height));
    System.out.println("Volume: " + deci.format(bulk));
    }
  }
