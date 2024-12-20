import costumers.Customer;
import courses.Course;


public class App{
    public static void main(String[] args){
        Course courseOne = new Course("Matemática Discreta", 30);
        Course courseTwo = new Course("Microbiologia", 20);
        Course courseThree = new Course("Cálculo 1", 50);
        Customer customerOne = new Customer("Rafael");
        Customer customerTwo = new Customer("Sthefany");
        Customer customerThree = new Customer("Maricota");
        customerOne.setUserCourse(courseOne);
        customerTwo.setUserCourse(courseTwo);
        customerThree.setUserCourse(courseThree);

        System.out.println("------------------------CLIENTES-------------------------");
        customerOne.showInformations();
        System.out.println("---------------------------------------------------------");
        customerTwo.showInformations();
        System.out.println("---------------------------------------------------------");
        customerThree.showInformations();
        System.out.println("---------------------------------------------------------");


        for(int i = 0; i <= 29; i++){
            customerOne.watchClass();
        }
        System.out.println("---------------------------------------------------------");

        for(int i = 0; i <= 19; i++){
            customerTwo.watchClass();
        }
        System.out.println("---------------------------------------------------------");  
        
        for(int i = 0; i <= 49; i++){
            customerThree.watchClass();
        }
        System.out.println("---------------------------------------------------------");
    }
}