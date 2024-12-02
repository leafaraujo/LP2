import agenda.Schedule;
import agenda.user.*;

public class App{

    public static void main(String [] args){
        Schedule agenda = new Schedule();
        HumanUser usuarioHumano = new HumanUser("705542", "maria", "rua do prego", "98845", "marialinda@gamil.com", "casada", "27/10/1959");
        BusinessUser businessUser = new BusinessUser("021", "RAFAEL", "rua do salvador", "542135", "marialindasda@gmail.com", "541832", "10/09/1990", "MENTIROSO S.A");
        agenda.addUser(usuarioHumano);
        agenda.addUser(businessUser);
        agenda.showUser();
    }
}