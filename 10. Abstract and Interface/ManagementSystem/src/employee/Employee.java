package employee;

public abstract class Employee{
    private double salary;
    private double bonusSalary = 0.0;
    private String name;
    private String position;
    private boolean hasBonus = false;


    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public boolean isHasBonus() {
        return hasBonus;
    }

    public void setHasBonus(boolean hasBonus) {
        this.hasBonus = hasBonus;
    }

    // Construtor
    public Employee(double salary, String name, String position) {
        this.salary = salary;
        this.name = name;
        this.position = position;
    }

    // Getters and Setters
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }


    // Outras funcionalidades
    public void showEmployeeInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary + "R$");
        System.out.println("Position: " + this.position);
        if(this.hasBonus){
            System.out.println("Bonus salary: " + this.bonusSalary);
        }
    }
    
    public abstract void calculateSalary();
}