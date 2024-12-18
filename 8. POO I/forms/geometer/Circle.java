package geometer;

public class Circle extends Geometer{
    private double radius = 0.0;

    public Circle(float radius) {
        super();
        this.radius = radius;
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        super.setArea(area);
        super.setPerimeter(perimeter);
    }

    public Circle(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        super.setArea(area);
        super.setPerimeter(perimeter);
    }

    @Override
    protected double calculateArea(){
        return (Math.PI * (Math.pow(radius, 2)));
    }

    @Override
    protected double calculatePerimeter(){
        return (2 * Math.PI * radius); 
    }
    

    @Override
    public void showInformations(){
        System.out.println("Raio: " + radius);
        super.showInformations();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
