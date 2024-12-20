package courses;

//OneToMany
public class Course {
    private String courseName;
    private int quantityOfClass;
    private int watchedClass = 0;
    private boolean isCompleted = false;


    public Course(String courseName, int quantityOfClass) {
        this.courseName = courseName;
        this.quantityOfClass = quantityOfClass;
    }

    public void showInformations(){
        System.out.println("Curso: " + this.courseName);
        System.out.println("Quantidade total de aulas: " + this.quantityOfClass);
        System.out.println("Quantidade de aulas assistidas: " + this.watchedClass);

    }
    //Getter e Setters

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getQuantityOfClass() {
        return quantityOfClass;
    }
    public void setQuantityOfClass(int quantityOfClass) {
        this.quantityOfClass = quantityOfClass;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
    public int getWatchedClass() {
        return watchedClass;
    }
    public void setWatchedClass(int watchedClass) {
        this.watchedClass = watchedClass;
    }

    
}
