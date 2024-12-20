package costumers;

import courses.Course;;

public class Customer{
    private String name;
    Course userCourse;
    //Construtor 
    public Customer(String name) {
        this.name = name;
    }

    //Outras funcionalidades
    private void finishCourse(){
        userCourse.setCompleted(true);
        System.out.println("Parabéns " + this.name);
        System.out.println("O curso " + this.userCourse.getCourseName() + " foi concluído com sucesso!");
        userCourse = null;
    }

    public void watchClass(){
        this.userCourse.setWatchedClass(this.userCourse.getWatchedClass() + 1);
        if(this.userCourse.getWatchedClass() == this.userCourse.getQuantityOfClass()){
            finishCourse();
        }
    }

    public void showInformations(){
        System.out.println("Nome: " + this.name);
        if(this.userCourse != null){
            this.userCourse.showInformations();
        }
        else{
            System.out.println("O usuário não está participando de nenhum curso");
        }
    }

    //Getters e Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Course getUserCourse() {
        return userCourse;
    }

    public void setUserCourse(Course userCourse) {
        this.userCourse = userCourse;
    }

}
