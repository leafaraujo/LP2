package account;
import user.User;

public abstract class Account {
    
    protected User user;
    protected int funds;
    protected String accountNumber;

    public Account(User user, int funds, String accountNumber) {
        this.user = user;
        this.funds = funds;
        this.accountNumber = accountNumber;
    }

    protected abstract void calculateValue();

    protected void makeWithdrawl(int valueOfWithdrawl){
        if(valueOfWithdrawl > funds){
            System.out.println("Saldo insuficiente!");
        }
        else{
            funds -= valueOfWithdrawl;
            System.out.printf("Saque no valor de %d reais realizado com sucesso!", valueOfWithdrawl);
            System.out.printf("Sua conta agora está com um saldo de %d reais", this.funds);
        }
    }

    protected void makeDeposit(int valueOfDeposit){
        if(valueOfDeposit <= 0){
            System.out.println("Valor inválido! O valor deve ser maior que 0.");
        }
        else{
            funds += valueOfDeposit;
            System.out.printf("Depósito no valor de %d reais realizado com suscesso!", valueOfDeposit);
            System.out.printf("Sua conta agora está com um saldo de %d reais", this.funds);        }
    }

    protected void showAccountDetails(){
        System.out.println("Nome do usuário: " + user.getName());
        System.out.println("Número da conta: " + this.accountNumber);
        System.out.println("Saldo da conta: " + this.funds + "R$");
    }
}
