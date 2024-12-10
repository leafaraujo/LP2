import ticket.*;

public class Main {
    public static void main(String [] args){
        TopPrivateBox superior = new TopPrivateBox(100.00, 150.50, 54.50);
        BottomPrivateBox inferior = new BottomPrivateBox(100.00, 150.50);
        NormalTicket normal = new NormalTicket(100.00);
        System.out.println("----------------------------------------");
        superior.showInformation();
        System.out.println("----------------------------------------");
        inferior.showInformation();
        System.out.println("----------------------------------------");
        normal.showInformation();
    }
}
