package agenda.user;

public class BusinessUser extends User{
    private String socialReason;
    private String stateRegistration;


    
    public BusinessUser(String taxID, String name, String adress, String phoneNumber, String email,
            String stateRegistration, String birthday, String socialReason) {
        super(taxID, name, adress, phoneNumber, email, birthday);
        this.stateRegistration = stateRegistration;
        this.socialReason = socialReason;
    }

    public void showUser(){
        System.out.println("Nome: " + super.getName());
        System.out.println("CNPJ: " + super.getTaxID());
        System.out.println("Data de criação: " + super.getBirthday());
        System.out.println("Razão social: " + this.socialReason);
        System.out.println("Inscrição estadual: " + this.stateRegistration);
        System.out.println("Número de telefone: " + super.getPhoneNumber());
        System.out.println("E-mail: " + super.getEmail());
        System.out.println("Endereço: " + super.getAdress());
    }

    public String getSocialReason() {
        return socialReason;
    }
    public void setSocialReason(String socialReason) {
        this.socialReason = socialReason;
    }
    public String getStateRegistration() {
        return stateRegistration;
    }
    public void setStateRegistration(String stateRegistration) {
        this.stateRegistration = stateRegistration;
    }
}