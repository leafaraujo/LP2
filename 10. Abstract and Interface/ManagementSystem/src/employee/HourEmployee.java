package employee;

import bonus.Bonus;

public class HourEmployee extends Employee implements Bonus{
    private int workedHours = 0;
    private double hourSalary;

    public HourEmployee(double salary, String name, String position, int workedHours, double hourSalary) {
        super(salary, name, position);
        this.workedHours = workedHours;
        this.hourSalary = hourSalary;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    //Se ele atingir um total maior que 220 horas, esse excedente é calculado com um valor de "bonus" adicional
    @Override
    public void calculateSalary(){
        if(workedHours > 220){
            calculateBonus();
            super.setSalary((workedHours * hourSalary) + super.getBonusSalary());
        }
        else{
            super.setSalary(workedHours * hourSalary);
        }
    }

    @Override
    public void showEmployeeInfo() {
        super.showEmployeeInfo();
        System.out.println("Salary of one hour: " + this.hourSalary);
        System.out.println("Worked Hours: " + this.workedHours);    }
    
    //Nessa abordagem, o valor da hora adicional vai ser calculado como sendo pago o dobro
    public void calculateBonus(){
        int hourOfBonus = (workedHours - 220);
        super.setBonusSalary(hourOfBonus * (hourSalary * 2));
        super.setHasBonus(true);
    }
}