import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00");
    float firstGrade = sc.nextFloat();
    float secondGrade = sc.nextFloat();
    float thirdGrade = sc.nextFloat();
    float fourthGrade = sc.nextFloat();
    float averageOne = (firstGrade + secondGrade) / 2;
    float averageTwo = (thirdGrade + fourthGrade) / 2;
    float averageTotal = (averageOne + averageTwo) / 2;
    System.out.println("Nota unidade 1: " + deci.format(averageOne));
    System.out.println("Nota unidade 2: " + deci.format(averageTwo));
    System.out.println("Média do aluno: " + deci.format(averageTotal));
    }
  }
