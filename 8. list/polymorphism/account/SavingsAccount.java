package account;
import user.User;

public final class SavingsAccount extends Account{
    private double interestRate = 0.05;

    public SavingsAccount(User user, int funds, String accountNumber){
        super(user, funds, accountNumber);
    }

    public void calculateValue(){
        super.funds += super.funds * interestRate;
    }

    @Override
    public void showAccountDetails(){
        super.showAccountDetails();
        System.out.println("Tipo de conta: Poupança");
        System.out.println("Taxa de juros: 5%");
    }
}