import agenda.Schedule;
import gui.GUI;
import agenda.user.*;
import java.util.Scanner;

public class App{

    public static void main(String [] args){
        Schedule agenda = new Schedule();
        String name, taxID, adress, email, phoneNumber, date;
        GUI gui = new GUI();
        Scanner sc = new Scanner(System.in);
        int userDecision = 0;
        while(true){
        gui.showMenu();
        System.out.println("Digite a opção desejada: ");
        userDecision = sc.nextInt();
        switch (userDecision){
            case 1:
                System.out.print("Nome do criador da empresa ");
                name = sc.nextLine();
                sc.nextLine();
                System.out.print("CNPJ: ");
                taxID = sc.nextLine();
                System.out.print("Endereço: ");
                adress = sc.nextLine();
                System.out.print("E-mail: ");
                email = sc.nextLine();
                System.out.print("Telefone: ");
                phoneNumber = sc.nextLine();
                System.out.print("Registro estadual: ");
                String stateRegister = sc.nextLine();
                System.out.print("Razão social: ");
                String socialReason = sc.nextLine();
                System.out.print("Data de criação da empresa: ");
                date = sc.nextLine();
                BusinessUser businessUser = new BusinessUser(taxID, name, adress, phoneNumber, email, stateRegister, date, socialReason);
                agenda.addUser(businessUser);
                System.out.println("Usuário cadastrado com sucesso!");
                break;
            case 2:
                System.out.print("Nome da pessoa: ");
                name = sc.nextLine();
                sc.nextLine();
                System.out.print("CPF: ");
                taxID = sc.nextLine();
                System.out.print("Endereço: ");
                adress = sc.nextLine();
                System.out.print("E-mail: ");
                email = sc.nextLine();
                System.out.print("Telefone: ");
                phoneNumber = sc.nextLine();
                System.out.print("Data de nascimento: ");
                date = sc.nextLine();
                System.out.print("Estado civil: ");
                String civilState = sc.nextLine();
                HumanUser usuarioHumano = new HumanUser(taxID, name, adress, phoneNumber, email, civilState, date);
                agenda.addUser(usuarioHumano);
                System.out.println("Usuário cadastrado com sucesso!");
                break;
            case 3:
                System.out.print("Digite o número fiscal de quem deseja remover: ");
                taxID = sc.nextLine();
                agenda.removeUser(taxID);
            break;
            case 4:
                agenda.showUser();
            break;
            case 5:
                System.out.println("Desligando o sistema....");
                sc.close();
                System.exit(0);
            break;
        }
    }
    }
}