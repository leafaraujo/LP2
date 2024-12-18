package employee;

import bonus.Bonus;

public class NormalEmployee extends Employee implements Bonus{
    private int workedDays = 0;
    private int sales = 0;
    private double daySalary;
    

    
    // Construtor
    public NormalEmployee(double salary, String name, String position, int workedDays, double daySalary, int sales) {
        super(salary, name, position);
        this.workedDays = workedDays;
        this.daySalary = daySalary;
        this.sales = sales;
    }
    //Getters and Setters
    public int getWorkedDays() {
        return workedDays;
    }
    public int getSales() {
        return sales;
    }
    public void setSales(int sales) {
        this.sales = sales;
    }
    public void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }
    public double getDaySalary() {
        return daySalary;
    }
    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }
    

    //Antoher functions

    @Override
    public void calculateSalary(){
        if(this.sales > 100){
            calculateBonus();
            super.setSalary((workedDays * daySalary) + super.getBonusSalary());
        }
        else{
            super.setSalary(workedDays * daySalary);
        }
    }

    @Override
    public void showEmployeeInfo() {
        super.showEmployeeInfo();
        System.out.println("Salary of one day: " + this.daySalary);
        System.out.println("Worked Days: " + this.workedDays);
        System.out.println("Sales on the month: " + this.sales);
    }
    
    public void calculateBonus(){
        int bonusSales = sales - 100;
        super.setBonusSalary(2.50 * bonusSales);
        super.setHasBonus(true);
    }
}
