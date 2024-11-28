package user;

public class User {
    private String name;
    private String CPF;
    private int age;

    //Construtor

    public User(String name, String CPF, int age) {
        this.name = name;
        this.CPF = CPF;
        this.age = age;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}


