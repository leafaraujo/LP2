package account;
import user.User;

public final class CheckingAccount extends Account{
    private double interestRate = 0.02;

    public CheckingAccount(User user, int funds, String accountNumber){
        super(user, funds, accountNumber);
    }

    public void calculateValue(){
        super.funds += super.funds * interestRate;
    }

    @Override
    public void showAccountDetails(){
        super.showAccountDetails();
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Taxa de juros: 2%");
    }
}
