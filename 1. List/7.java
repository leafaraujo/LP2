import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00");
    System.out.println("Digite a temperatura em graus Farenheit: ");
    float tempInFarenheit = sc.nextInt();
    float tempInCelsius = (tempInFarenheit - 32) * 5/9;
    System.out.println("A temperatura em graus Celsius é: " + deci.f);
    }
  
}
