package agenda.user;

public class HumanUser extends User{
    private String civilState;
    
    public HumanUser(String taxID, String name, String adress, String phoneNumber, String email, String civilState,
    String birthday) {
        super(taxID, name, adress, phoneNumber, email, birthday);
        this.civilState = civilState;
    }

    public void showUser(){
        System.out.println("Nome: " + super.getName());
        System.out.println("CPF: " + super.getTaxID());
        System.out.println("Data de nascimento: " + super.getBirthday());
        System.out.println("Estado civil: " + this.civilState);
        System.out.println("Número de telefone: " + super.getPhoneNumber());
        System.out.println("E-mail: " + super.getEmail());
        System.out.println("Endereço: " + super.getAdress());
    }

    public String getCivilState() {
        return civilState;
    }

    public void setCivilState(String civilState) {
        this.civilState = civilState;
    }

    
}