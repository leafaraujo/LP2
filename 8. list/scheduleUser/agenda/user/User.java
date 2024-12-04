package agenda.user;

public abstract class User{
    private String taxID;
    private String name;
    private String adress;
    private String phoneNumber;
    private String email;
    private String birthday;

    // Construtor vazio
    public User(){}

    // Construtor preenchido
    public User(String taxID, String name, String adress, String phoneNumber, String email, String birthday) {
        this.taxID = taxID;
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
    }

    public abstract void showUser();
    
    // Getters and Setters
    public String getTaxID() {
        return taxID;
    }
    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}