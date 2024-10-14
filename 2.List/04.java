import java.util.Scanner;


public class Main {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String senha;
    int errors = 4;
    System.out.println("Digite a senha para entrar no sistema");
    
    do{
      senha = input.nextLine();
      
      if(errors == 0){
        System.out.println("Você excedeu o número de tentativas e o acesso foi bloqueado");
        break;
        
      }
      if(senha.equals("1234")){
        System.out.println("Bem-vindo ao sistema!");
        break;
    }
      else{
        System.out.println("A senha está errada, digite uma correta");
        errors --;
        System.out.printf("Você tem %d tentativa(s)\n", (errors+1));
    }
      
    }while(!senha.equals("1234"));

  }
}
