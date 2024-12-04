package agenda;

import java.util.ArrayList;
import agenda.user.*;
import agenda.sortbyint.SortByInt;

public class Schedule{
    private ArrayList<User> usuários = new ArrayList<User>();
    SortByInt comparator = new SortByInt();
    // Construtor vazio, começa sem elementos
    public Schedule() {}

    public void addUser(User usuario){
        this.usuários.add(usuario);
        scheduleSort();
    }

    private void scheduleSort(){
        int len = usuários.size();
        User auxiliar;

    for(int i = 0; i < len - 1; i++){
        int minIndex = i;
        for(int j = i+1; j < len ; j++){
        if(comparator.compare(usuários.get(j).getTaxID(), usuários.get(minIndex).getTaxID()) < 0){
            minIndex = j;
            }
        }

        if(minIndex != i){
            auxiliar = usuários.get(minIndex);
            usuários.set(minIndex, usuários.get(i));
            usuários.set(i, auxiliar);
        }
    }
}

    public void removeUser(String taxID){
        for(int i = 0; i < usuários.size(); i++){
            if(usuários.get(i).getTaxID().equals(taxID)){
                usuários.remove(usuários.get(i));
            }
        }
        System.out.println("Esse usuário não está cadastrado em nosso banco de dados.");
    }
    
    public void showUser(){
        for(int i = 0; i < usuários.size(); i++){
            System.out.println("---------------------------");
            usuários.get(i).showUser();
            System.out.println("---------------------------");
        }
    }
}
