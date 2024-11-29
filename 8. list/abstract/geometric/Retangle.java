package geometric;

public class Retangle extends Geometric{
    private double smallestSide = 0;
    private double largestSide = 0;

    @Override
    protected double calculateArea(){
        return (largestSide*smallestSide);
    }

    @Override
    protected double calculatePerimeter(){
        return (this.smallestSide * 2) + (this.largestSide * 2);
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
        System.out.println("Menor lado: " + this.smallestSide);
        System.out.println("Maior lado: " + this.largestSide);
        super.showInformations();
    }
    
    public Retangle(int smallestSide, int largestSide) {
        super();
        this.smallestSide = smallestSide;
        this.largestSide = largestSide;
        defineFigure();
    }

    public double getSmallestSide() {
        return smallestSide;
    }
    public void setSmallestSide(double smallestSide) {
        this.smallestSide = smallestSide;
        defineFigure();
    }
    public double getLargestSide() {
        return largestSide;
    }
    public void setLargestSide(double largestSide) {
        this.largestSide = largestSide;
        defineFigure();
    }
}