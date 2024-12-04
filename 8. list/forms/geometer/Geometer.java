package geometer;

public abstract class Geometer {
    private double area = 0.0;
    private double perimeter = 0.0;
    private String color = " ";
    private boolean isFilled;
    

    //Constructors
    public Geometer(){}

    public Geometer(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    //Abstract functions
    protected abstract double calculateArea();
    protected abstract double calculatePerimeter();

    //Another functions

    protected void showInformations(){
        System.out.println("Area: " + this.area);
        System.out.println("Perimetro: " + this.perimeter);
        if(isFilled){
            System.out.println("Cor: " + this.color);
        }
        else{
            System.out.println("A figura não está pintada");
        }
    }

    public void paintFigure(String color){
        isFilled = true;
        this.color = color;
    }

    //Getters and setters

    protected void setArea(double area) {
        this.area = area;
    }
    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
  
}
