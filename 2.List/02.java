import java.util.Scanner;


public class Main {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    char vowel[] = {'a', 'e', 'i', 'o', 'u'};
    char consonant[] = {'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char number[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    System.out.println("Enter a character: ");
    String characterAux = input.nextLine();
    
    if(characterAux.length() > 1){
      System.out.println("This is not a char!");
      System.exit(0);
    }
    
    char characterPrint = characterAux.charAt(0);
    characterAux = characterAux.toLowerCase();
    char character = characterAux.charAt(0);
    for(int i : vowel){
      if(character == i){
        System.out.println("O caractere '" + characterPrint + "' é uma vogal");
        System.exit(0);
      }
    }
    for(int j : consonant){
      if(character == j){
        System.out.println("O caractere '" + characterPrint + "' é uma consoante");
        System.exit(0);
      } 
    }
    for(int k : number){
      if(character == k){
        System.out.println("O caractere '" + characterPrint + "' é um número");
        System.exit(0);
      }
    }
    System.out.println("O caractere '" + characterPrint + "' é um símbolo especial");
  }
}
