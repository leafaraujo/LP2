package geometric;

public abstract class Geometric{
    private double figureArea = 0;
    private double figurePerimeter = 0;

    protected abstract double calculateArea();
    protected abstract double calculatePerimeter();
    protected abstract void defineFigure();

    public Geometric() {}


    protected void showInformations(){
        System.out.println("Perímetro: " + this.figurePerimeter);
        System.out.println("Área: " + this.figureArea);
    }

    public Geometric(double figureArea, double figurePerimeter) {
        this.figureArea = figureArea;
        this.figurePerimeter = figurePerimeter;
    }

    // Getters and Setters
    public double getFigureArea() {
        return figureArea;
    }

    public void setFigureArea(double figureArea) {
        this.figureArea = figureArea;
    }

    public double getFigurePerimeter() {
        return figurePerimeter;
    }

    public void setFigurePerimeter(double figurePerimeter) {
        this.figurePerimeter = figurePerimeter;
    }

    
}