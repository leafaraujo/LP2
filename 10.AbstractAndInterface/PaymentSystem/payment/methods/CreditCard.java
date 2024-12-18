package  payment.methods;

import payment.authentication.Authentication;
import payment.Payment;

public class CreditCard extends Payment implements Authentication{

    public CreditCard(double value) {
        super(value);
    }

    @Override
    public void makePayment(double value) {
        if(this.authenticPayment(value)){
            System.out.println("Pagamento realizado com sucesso!");
            System.out.println("O valor de " + super.getValueOfPayment() + " foi retirado de seu limite");
            super.setPaid(true);
            return;
        }
        System.out.println("O pagamento foi recusado porque o limite é insuficiente.");
    }

    public boolean authenticPayment(double value){
        if(value < super.getValueOfPayment()){
            System.out.println("O cartão não tem limite suficiente para realizar a compra!");
            return false;
        }
        return true;
    }
}