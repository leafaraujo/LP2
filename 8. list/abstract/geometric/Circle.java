package geometric;

public class Circle extends Geometric{
    double radius = 0;

    @Override
    protected double calculateArea() {
        return (Math.PI * (Math.pow(radius, 2)));
    }

    @Override
    protected double calculatePerimeter() {
        return (2 * Math.PI * radius); 
    }

    @Override
    protected void defineFigure(){
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        super.setFigureArea(area);
        super.setFigurePerimeter(perimeter);
    }

    @Override
    public void showInformations(){
        System.out.println("Raio: " + this.radius);
        super.showInformations();
    }
    

    public Circle(int radius) {
        super();
        this.radius = radius;
        defineFigure();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        defineFigure();
    }

    
}