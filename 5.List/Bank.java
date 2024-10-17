import java.util.Scanner;

  public class Main{

    public static void main(String[] args) {
      BankAccount accounts [] = new BankAccount[10];
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
            Customer customer = new Customer(name, cpf);
            BankAccount account = new BankAccount(password, customer);
            accounts[quantityOfCustomers] = account;
            quantityOfCustomers++;
            System.out.println("Cliente adicionado com sucesso!");
            break;
          case 2:
            System.out.print("Digite o CPF do cliente: ");
            cpf = input.next();
            for(int i = 0; i < quantityOfCustomers; i++){
              if(accounts[i].getCustomer().getTaxID().equals(cpf)){
                System.out.print("Digite a senha do cliente: ");
                password = input.next();
                if(accounts[i].getPassword().equals(password)){
                  System.out.print("Digite o valor a ser depositado: ");
                  value = input.nextFloat();
                  accounts[i].addMoney(value);
                  System.out.println("Valor depositado com sucesso!");
                  break;
                }
                else{
                  System.out.println("A senha está incorreta!");
                  System.out.println("Dica: Sua senha é " + accounts[i].getPassword());
                  break;
                }
              }
            }
            System.out.println("Usuário não encontrado!");
            break;
          case 3:
            System.out.print("Digite o CPF do cliente: ");
            cpf = input.next();
            for(int i = 0; i < quantityOfCustomers; i++){
              if(accounts[i].getCustomer().getTaxID().equals(cpf)){
                System.out.print("Digite a senha do cliente: ");
                password = input.next();
                if(accounts[i].getPassword().equals(password)){
                  System.out.print("Digite o valor a ser sacado: ");
                  value = input.nextFloat();
                  if(accounts[i].getBalance() < value){
                    System.out.println("Você não tem saldo suficiente!");
                    break;
                  }
                  else{
                  accounts[i].subMoney(value);
                  System.out.println("Valor sacado com sucesso!");
                  break;
                  }
                }
                else{
                  System.out.println("A senha está incorreta!");
                  System.out.println("Dica: Sua senha é " + accounts[i].getPassword());
                  break;
                }
              }
            }
            System.out.println("Usuário não encontrado!");
            break;
          case 4:
            System.out.print("Digite o CPF do cliente: ");
            cpf = input.next();
            for(int i = 0; i <= quantityOfCustomers; i++){
              if(accounts[i].getCustomer().getTaxID().equals(cpf)){
                System.out.print("Digite a senha do cliente: ");
                password = input.next();
                if(accounts[i].getPassword().equals(password)){
                  accounts[i].showAccount();
                  break;
                }
                else{
                  System.out.println("A senha está incorreta!");
                  System.out.println("Dica: Sua senha é " + accounts[i].getPassword());
                  break;
                }
              }
            }
          System.out.println("Usuário não encontrado!");
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

        public Customer(String nome, String taxID) {
          this.nome = nome;
          this.taxID = taxID;
        }

        public String getName() {
            return nome;
        }

      public String getTaxID(){
          return taxID;
      }
    }


    static class BankAccount {
      private float funds = 0;
      private String password;
      private Customer customer;


      public BankAccount(String password, Customer customer) {
        this.password = password;
        this.customer = customer;
      }

      public float getBalance() {
            return funds;
      }

      public Customer getCustomer(){
        return this.customer;
      }

      public String getPassword(){
        return this.password;
      }

      public void showAccount(){
        System.out.println("Cliente " + this.customer.getName());
        System.out.println("CPF: " + this.customer.getTaxID());
        System.out.println("Saldo: " + this.funds);
      }

      public void subMoney(float value){
        funds -= value;
        if(funds < 0){
          funds = 0;
        }
      }

        public void addMoney(float value){
          funds += value;
        }
      
      }
  }
