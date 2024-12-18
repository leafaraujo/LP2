package gui;

public class Menu {
    
    public void createLine(){
        System.out.println("-------------------------------------------");
      }
    
      public void showMenu(){
        createLine();
        System.out.println("               LASCADO BANK");
        createLine();
        System.out.println("1 - Cadastrar cliente");
        createLine();
        System.out.println("2 - Mostrar todas as contas-corrente");
        createLine();
        System.out.println("3 - Mostrar todas as contas-poupança");
        createLine();
        System.out.println("4 - Atualizar saldos");
        createLine();
        System.out.println("5 - Sair");
        createLine();
      }
}
