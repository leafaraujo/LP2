import java.util.Scanner;

  public class Main{

        public static void main(String[] args) {
          Customer customers [] = new Customer[10];
          Car cars [] = new Car[10];
          Reservation reservations [] = new Reservation[10];
          int userInput = 0, quantityOfCustomers = 0, quantityOfCars = 0, quantityOfReservations = 0, id = 0;
          String cpf, placa;
          Scanner input = new Scanner(System.in);
          boolean keepGoin = true;
          while(keepGoin){
            System.out.println("----------------------------");
            System.out.println("          IMD CAR'S         ");
            System.out.println("----------------------------");
            System.out.println("----------------------------");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("----------------------------");
            System.out.println("2 - Cadastrar Carro");
            System.out.println("----------------------------");
            System.out.println("3 - Realizar reserva");
            System.out.println("----------------------------");
            System.out.println("4 - Realizar devolução");
            System.out.println("----------------------------");
            System.out.println("5 - Mostrar Reserva");
            System.out.println("----------------------------");
            System.out.println("6 - Sair");
            System.out.println("----------------------------");
            userInput = input.nextInt();
            switch(userInput){
              case 1:
                System.out.print("Digite o nome do cliente: ");
                String name = input.next();
                System.out.print("Digite o CPF do cliente: ");
                cpf = input.next();
                Customer customer = new Customer(name, cpf);
                customers[quantityOfCustomers] = customer;
                quantityOfCustomers++;
                System.out.println("Cliente adicionado com sucesso!");
                break;
              case 2:
                System.out.print("Digite a marca do carro: ");
                String type = input.next();
                System.out.print("Digite a cor do carro: ");
                String color = input.next();
                System.out.print("Digite a placa do carro: ");
                placa = input.next();
                Car car = new Car(type, color, placa);
                cars[quantityOfCars] = car;
                quantityOfCars ++;
                break;
              case 3:
                System.out.print("Digite o CPF do cliente: ");
                cpf = input.next();
                for(int i = 0 ; i < quantityOfCustomers; i++){
                  if(customers[i].getTaxID().equals(cpf)){
                    System.out.print("Digite a placa do carro: ");
                    placa = input.next();
                    for(int j = 0; j < quantityOfCars; j++){
                      if(cars[j].getPlaca().equals(placa)){
                        if(cars[j].getIsRented()){
                          System.out.println("O carro já está alugado!");
                        }
                        else{
                          Reservation rent = new Reservation(customers[i], cars[j]);
                          cars[j].setIsRented(true);
                          reservations[quantityOfReservations] = rent;
                          System.out.println("A reserva foi feita com sucesso, o ID eh " + quantityOfReservations + 1);
                          quantityOfReservations ++;
                        }
                      }
                    }
                  }
                }
                break;
              case 4:
                System.out.print("Digite o ID da reserva: ");
                id = input.nextInt();
                id --;
                reservations[id].breakReservation();
                System.out.println("O carro foi devolvido!");
                System.out.println("Agora poderá pegar o veículo novamente!");
                System.out.println("Por segurança, vamos manter gravados os registros desse aluguel!");
              break;
              case 5: 
                System.out.print("Digite o ID da reserva: ");
                id = input.nextInt();
                id --;
                reservations[id].showReservation();
                break;
              case 6: 
                keepGoin = false;
                break;
              default:
                System.out.println("Opção inválida!");
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

            public String getNome() {
                return nome;
            }

          public String getTaxID(){
              return taxID;
          }
        }

        static class Car{
          private String type;
          private String color;
          private String placa;
          private boolean isRented = false;
            

          public Car(String type, String color, String placa) {
            this.type = type;
            this.color = color;
            this.placa = placa;
          }

          public String getType() {
            return this.type;
          }

          public String getColor(){
            return this.color;
          }

          public String getPlaca(){
            return this.placa;
          }
          
          public boolean getIsRented(){
            return this.isRented;
          }   

          public void setIsRented(boolean isRented){
            this.isRented = isRented;
          } 
        }

    static class Reservation{
      private Customer customer;
      private Car car;

      public Reservation(Customer customer, Car car){
        this.customer = customer;
        this.car = car;
      }

      public Customer getCustomer(){
        return this.customer;
      }

      public Car getCar(){
        return this.car;
      }
      public void showReservation(){
        System.out.println("Nome: " + this.customer.getNome());
        System.out.println("CPF: " + this.customer.getTaxID());
        System.out.println("Tipo de carro: " + this.car.getType());
        System.out.println("Cor do carro: " + this.car.getColor());
        System.out.println("Placa do carro: " + this.car.getPlaca());
      }

      public void breakReservation(){
        this.car.setIsRented(false);
      }
    }
  }
