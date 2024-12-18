import java.util.ArrayList;
import java.util.Scanner;

import gui.Menu;
import user.User;
import account.*;

public class App{

    public static void main(String [] args){
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        ArrayList<CheckingAccount> checkingAccounts= new ArrayList<CheckingAccount>();
        ArrayList<SavingsAccount> savingAccounts = new ArrayList<SavingsAccount>();
        while(true){
            menu.showMenu();
            System.out.print("Digite uma opção: ");
            userInput = scanner.nextInt();
            switch(userInput){
                case 1:
                scanner.nextLine();
                String name, cpf, accountNumber, accountType;
                int age = 0, funds = 0;
                System.out.println("Digite o nome do utilizador: ");
                name = scanner.nextLine();
                System.out.println("Digite o CPF do utilizador: ");
                cpf = scanner.nextLine();
                System.out.println("Digite a idade do utilizador: ");
                age = scanner.nextInt();
                User user = new User(name, cpf, age);
                System.out.println("Digite a quantidade de saldo inicial na conta.");
                funds = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o número da conta.");
                accountNumber = scanner.nextLine();
                System.out.println("Digite qual o tipo de conta! (poupança/corrente)");
                accountType = scanner.nextLine();
                if(accountType.equals("poupança")){
                    SavingsAccount conta = new SavingsAccount(user, funds, accountNumber);
                    savingAccounts.add(conta);
                    System.out.println("Conta poupança criada com sucesso!");
                }
                else if(accountType.equals("corrente")){
                    CheckingAccount conta = new CheckingAccount(user, funds, accountNumber);
                    checkingAccounts.add(conta);
                    System.out.println("Conta corrente criada com sucesso!");
                }
                break;
                case 2:
                for(int i = 0; i < checkingAccounts.size(); i++){
                    menu.createLine();
                    checkingAccounts.get(i).showAccountDetails();
                    menu.createLine();
                }
                break;
                case 3:
                for(int i = 0; i < savingAccounts.size(); i++){
                    menu.createLine();
                    savingAccounts.get(i).showAccountDetails();
                    menu.createLine();
                }
                break;
                case 4:
                for(int i = 0; i < checkingAccounts.size(); i++){
                    checkingAccounts.get(i).calculateValue();
                }
                for(int j = 0; j < savingAccounts.size(); j++){
                    savingAccounts.get(j).calculateValue();
                }
                System.out.println("Valores atualizados com sucesso!");
                break;
                case 5:
                System.out.println("");
                System.out.println("Saindo do programa...");
                scanner.close();
                System.exit(0);
                break;
            }
        }
    }
}

