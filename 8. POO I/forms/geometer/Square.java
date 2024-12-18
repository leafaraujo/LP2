package geometer;

public class Square extends Geometer{
    private double side;

    public Square(double side) {
        super();
        this.side = side;
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        super.setArea(area);
        super.setPerimeter(perimeter);
    }

    public Square(String color, boolean isFilled, double side) {
        super(color, isFilled);
        this.side = side;
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        super.setArea(area);
        super.setPerimeter(perimeter);
    }

    @Override
    protected double calculateArea(){
        return (this.side * this.side);
    }

    @Override
    protected double calculatePerimeter(){
        return (this.side * 4);
    }

    @Override
    public void showInformations(){
        System.out.println("Lado: " + side);
        super.showInformations();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    
}
