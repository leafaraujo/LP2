import java.util.Scanner;

public class Main{

        public static void main(String[] args) {
          Customer bankCustomers [] = new Customer[10];
          int userInput = 0, quantityOfCustomers = 0;
          String cpf, password;
          float value = 0;
          Scanner input = new Scanner(System.in);
          boolean keepGoin = true;
          while(keepGoin){
            System.out.println("----------------------------");
            System.out.println("          IMD bank          ");
            System.out.println("----------------------------");
            System.out.println("----------------------------");
            System.out.println("1 - Realizar cadastro");
            System.out.println("----------------------------");
            System.out.println("2 - Realizar depósito");
            System.out.println("----------------------------");
            System.out.println("3 - Realizar saque");
            System.out.println("----------------------------");
            System.out.println("4 - Ver informações da conta");
            System.out.println("----------------------------");
            System.out.println("5 - Sair");
            System.out.println("----------------------------");
            userInput = input.nextInt();
            switch(userInput){
              case 1:
                System.out.print("Digite o nome do cliente: ");
                String name = input.next();
                System.out.print("Digite o CPF do cliente: ");
                cpf = input.next();
                System.out.print("Digite o a senha do cliente: ");
                password = input.next();
                BankAccount account = new BankAccount();
                Customer customer = new Customer(name, cpf, password, account);
                bankCustomers[quantityOfCustomers] = customer;
                quantityOfCustomers++;
                System.out.println("Cliente adicionado com sucesso!");
                break;
              case 2:
                System.out.print("Digite o CPF do cliente: ");
                cpf = input.next();
                System.out.print("Digite a senha do cliente: ");
                password = input.next();
                for(int i = 0; i <= quantityOfCustomers; i++){
                  if(bankCustomers[i].getTaxID().equals(cpf)){
                    if(bankCustomers[i].getPassword().equals(password)){
                      System.out.print("Digite o valor a ser depositado: ");
                      value = input.nextFloat();
                      bankCustomers[i].addMoney(value);
                      System.out.println("Valor depositado com sucesso!");
                      break;
                    }
                    else{
                      System.out.println("A senha está incorreta!");
                      System.out.println("Dica: Sua senha é " + bankCustomers[i].getPassword());
                      break;
                    }
                  }
                  System.out.println("Usuário não encontrado!");
                }
                break;
              case 3:
                System.out.print("Digite o CPF do cliente: ");
                cpf = input.next();
                System.out.print("Digite a senha do cliente: ");
                password = input.next();
                for(int i = 0; i <= quantityOfCustomers; i++){
                  if(bankCustomers[i].getTaxID().equals(cpf)){
                    if(bankCustomers[i].getPassword().equals(password)){
                      System.out.print("Digite o valor a ser sacado: ");
                      value = input.nextFloat();
                      if(bankCustomers[i].getFunds() < value){
                        System.out.println("Você não tem esse saldo suficiente!");
                        break;
                      }
                      else{
                      bankCustomers[i].removeMoney(value);
                      System.out.println("Valor sacado com sucesso!");
                      break;
                      }
                    }
                    else{
                      System.out.println("A senha está incorreta!");
                      System.out.println("Dica: Sua senha é " + bankCustomers[i].getPassword());
                      break;
                    }
                  }
                  System.out.println("Usuário não encontrado!");
                }
                break;
              case 4:
                System.out.print("Digite o CPF do cliente: ");
                cpf = input.next();
                System.out.print("Digite a senha do cliente: ");
                password = input.next();
                for(int i = 0; i <= quantityOfCustomers; i++){
                  if(bankCustomers[i].getTaxID().equals(cpf)){
                    if(bankCustomers[i].getPassword().equals(password)){
                      bankCustomers[i].getAccountDetails();
                      break;
                    }
                    else{
                      System.out.println("A senha está incorreta!");
                      System.out.println("Dica: Sua senha é " + bankCustomers[i].getPassword());
                      break;
                    }
                  }
                  System.out.println("Usuário não encontrado!");
                }
              break;
              case 5: 
                keepGoin = false;
                break;
                default:
                System.out.println("Essa opção é inválida");
            }
          }
        }

        
        static class Customer {
            private String nome;
            private String taxID;
            private String password;
            private BankAccount account;

            public Customer(String nome, String taxID, String password, BankAccount account) {
              this.nome = nome;
              this.taxID = taxID;
              this.password = password;
              this.account = account;
            }

            public String getNome() {
                return nome;
            }

          public String getTaxID(){
              return taxID;
          }

          public String getPassword(){
              return password;
          }

          public void getAccountDetails(){
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + taxID);
            System.out.println("Saldo da conta: " + account.getBalance());
          }

          public float getFunds(){
            return account.getBalance();
          }
          

          public void addMoney(float value){
            account.addMoney(value);
          }

          public void removeMoney(float value){
            account.subMoney(value);
          }
        }

        static class BankAccount {
          private float funds = 0;
            

          public BankAccount() {}

          public float getBalance() {
                return funds;
          }

          public void subMoney(float value){
            funds -= value;
            if(funds < 0){
              funds = 0;
            }
          }
        }
}

          public void addMoney(float value){
            funds += value;
          }
          
