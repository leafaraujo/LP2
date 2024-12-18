import geometer.*;

public class App{

    public static void main(String[] args){
        Circle cirquin = new Circle("Vermelho", true, 2);
        Retangle retanguin = new Retangle(10, 5.2);
        Square quadradin = new Square("Laranja", true, 4.5);
        System.out.println("--------------------------------------------");
        cirquin.showInformations();
        System.out.println("--------------------------------------------");
        retanguin.showInformations();
        System.out.println("--------------------------------------------");
        quadradin.showInformations();
    }
    
}
