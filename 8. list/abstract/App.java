import geometric.*;

public class App{

    public static void main(String [] args){
        Circle circleOne = new Circle(5);
        Retangle retangleOne = new Retangle(5, 10);
        System.out.println("Primeiro círculo: ");
        circleOne.showInformations();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("Primeiro retangulo: ");
        retangleOne.showInformations();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        circleOne.setRadius(1);
        retangleOne.setLargestSide(20);
        retangleOne.setSmallestSide(2);
        System.out.println("Alterei alguns dados das formas, veja como ficou: ");
        System.out.println("Primeiro círculo: ");
        circleOne.showInformations();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("Primeiro retangulo: ");
        retangleOne.showInformations();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
    }
}