import java.util.Scanner;;

public class App {
    

    public static void main(String [] args){
    int sumNumber = 0, number = 0, valoresSomados = 0;

    while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número a ser somado");
        try {
            number = sc.nextInt();
            sumNumber += number;
        } catch (Exception e) {
            throw new RuntimeException("Esse valor não é um inteiro: " + e.getMessage());
        }
        }
    }
}
