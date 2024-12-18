import employee.*;

public class App {
    public static void main(String[] args){
        HourEmployee workerZero = new HourEmployee(0, "Ricardo Barbosa", "Servente", 250, 14.5);
        HourEmployee lazyWorkerZero = new HourEmployee(0, "Carla Cabral", "Freelancer", 100, 12.5);
        NormalEmployee workerOne = new NormalEmployee(0, "Rafael Araújo", "Vendedor", 22, 65.00, 200);
        NormalEmployee lazyWorkerOne = new NormalEmployee(0, "Mateus Sousa", "Vendedor", 20, 50.20, 50);
        workerZero.calculateSalary();
        workerOne.calculateSalary();
        lazyWorkerZero.calculateSalary();
        lazyWorkerOne.calculateSalary();
        System.out.println("=============================Empregados=============================;");
        workerZero.showEmployeeInfo();
        System.out.println("====================================================================");
        lazyWorkerZero.showEmployeeInfo();
        System.out.println("====================================================================");
        workerOne.showEmployeeInfo();
        System.out.println("====================================================================");
        lazyWorkerOne.showEmployeeInfo();
        System.out.println("====================================================================");
    }
}