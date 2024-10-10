import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00");
    System.out.println("Digite o valor das notas das 3 unidades do aluno: ");
    float unityOne = input.nextFloat();
    float unityTwo = input.nextFloat();
    float unityThree = input.nextFloat();
    float gradePointAverage = (unityOne + unityTwo + unityThree) / 3;
    System.out.println("Média: " + deci.format(gradePointAverage));
    
    if(gradePointAverage >= 6 && unityOne >= 4 && unityTwo >= 4 && unityThree >= 4){
      System.out.println("Resultado: Aprovado");
    }
    else if(gradePointAverage >= 3){
      System.out.println("Resultado: Reposição");
      float min = (unityOne < unityTwo)? unityOne : unityTwo;
      min = (min < unityThree)? min : unityThree;
      System.out.println("Digite a nota da prova de reposição: ");
      float reposition = input.nextFloat();
      gradePointAverage = (((gradePointAverage * 3) - min) + reposition)/3;
      if(gradePointAverage >= 5 && reposition >= 4){
        System.out.println("Média atualizada: " + deci.format(gradePointAverage));
        System.out.println("Resultado: Aprovado por nota");
      }
      else{
        System.out.println("Resultado: Repovado");
      }
      }
    else{
      System.out.println("Resultado: Reprovado");
    }
  }
}
