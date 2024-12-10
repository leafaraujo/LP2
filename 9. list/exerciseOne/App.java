import property.*;

public class App {
    public static void main(String[] args){
        Property propiedade = new Property(100000, "Rua dos namorados");
        OldProperty velha = new OldProperty(50000.00, "Rua das goiabas", 2500.80);
        NewProperty nova = new NewProperty(120000.00, "Rua do mercadinho", 3000.50);
        System.out.println("----------------------------------------");
        propiedade.showInformation();
        System.out.println("----------------------------------------");
        velha.showInformation();
        System.out.println("----------------------------------------");
        nova.showInformation();
        System.out.println("----------------------------------------");
    }
}
