package gui;

public class GUI {
    public void makeLine(){
        System.out.println("--------------------------------");
    }

    public void showMenu(){
        makeLine();
        System.out.println("---------[MUSK AGENDA]----------");
        makeLine();
        System.out.println("1 - Adicionar pessoa jurídica");
        makeLine();
        System.out.println("2 - Adicionar pessoa física");
        makeLine();
        System.out.println("3 - Remover usuário");
        makeLine();
        System.out.println("4 - Mostrar todos os usuários");
        makeLine();
        System.out.println("5 - Encerrar programa");
    }
}
