package geometer;

public class Retangle extends Geometer{
    public double smallSide = 0.0;
    public double largeSide = 0.0;
    
    // Constructors
    public Retangle(double smallSide, double largeSide) {
        super();
        this.smallSide = smallSide;
        this.largeSide = largeSide;
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        super.setArea(area);
        super.setPerimeter(perimeter);
    }
    public Retangle(String color, boolean isFilled, double smallSide, double largeSide) {
        super(color, isFilled);
        this.smallSide = smallSide;
        this.largeSide = largeSide;
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        super.setArea(area);
        super.setPerimeter(perimeter);
    }

    // Another functions

    @Override
    public void showInformations(){
        System.out.println("Menor lado: " + smallSide);
        System.out.println("Maior lado: " + largeSide);
        super.showInformations();
    }

    @Override
    public double calculateArea(){
        return (this.smallSide * this.largeSide);
    }

    @Override
    protected double calculatePerimeter(){
        return (this.smallSide * 2) + (this.largeSide * 2);
    }
    // Getters and Setters
    public double getSmallSide() {
        return smallSide;
    }
    public void setSmallSide(double smallSide) {
        this.smallSide = smallSide;
    }
    public double getLargeSide() {
        return largeSide;
    }
    public void setLargeSide(double largeSide) {
        this.largeSide = largeSide;
    }
}
