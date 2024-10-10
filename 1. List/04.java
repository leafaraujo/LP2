import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00");
    System.out.println("Digite quais são os valores dos lados A, B e C de seu triângulo: ");
    float A = input.nextFloat();
    float B = input.nextFloat();
    float C = input.nextFloat();
    double perimeter = A + B + C;
    System.out.println("LADO A: " + A);
    System.out.println("LADO B: " + B);
    System.out.println("LADO C: " + C);
    System.out.println("PERÍMETRO: " + deci.format(perimeter));
    }
  }
