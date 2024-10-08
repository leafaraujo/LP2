import java.util.Scanner;


public class Main {
  
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o sua idade em dias: ");
    int ageInDays = sc.nextInt();
    int ageInYears = ageInDays/365;
    int ageInMonths = (ageInYears * 12) + (ageInDays%365)/30;
    System.out.println("Idade em anos: " + ageInYears);
    System.out.println("Idade em meses: " + ageInMonths);
    System.out.println("Idade em dias: " + ageInDays);
  }
  
}
