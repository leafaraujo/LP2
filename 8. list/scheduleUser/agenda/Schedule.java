package agenda;

import java.util.ArrayList;
import agenda.user.*;
import agenda.sortbyint.SortByInt;

public class Schedule{
    private ArrayList<User> usuários = new ArrayList<User>();
    SortByInt comparator = new SortByInt();
    // Construtor vazio, começa sem elementos
    public Schedule() {}

    public void addUser(User usuário){
        User auxiliar, auxiliar2;
        int counter;
        for(int i = 0; i < this.usuários.size(); i++){
            if(comparator.compare(usuário.getTaxID(), usuários.get(i).getTaxID()) == 0){
                System.out.println("Esse usuário já está cadastrado em nosso banco de dados!");
            }
            else if(comparator.compare(usuário.getTaxID(), usuários.get(i).getTaxID()) > 0){
                continue;
            }
            else if(comparator.compare(usuário.getTaxID(), usuários.get(i).getTaxID()) < 0){
                auxiliar = usuários.get(i);
                usuários.set(i, usuário);
                for(counter = i + 1; counter < usuários.size(); counter ++){
                    auxiliar2 = usuários.get(counter);
                    usuários.set(counter, auxiliar);
                    auxiliar = auxiliar2;
                }
            }
        }
    }

    public void removeUser(String taxID){
        for(int i = 0; i < usuários.size(); i++){
            if(usuários.get(i).getTaxID().equals(taxID)){
                usuários.remove(usuários.get(i));
            }
        }
    }
    
    public void showUser(){
        for(int i = 0; i < usuários.size(); i++){
            System.out.println("---------------------------");
            usuários.get(i).showUser();
            System.out.println("---------------------------");
        }
    }
}