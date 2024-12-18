package  payment.methods;

import payment.authentication.Authentication;
import payment.Payment;

public class PaymentSlip extends Payment implements Authentication {

    public PaymentSlip(double valueOfPayment) {
        super(valueOfPayment);
    }

    @Override
    public void makePayment(double value) {
        if(this.authenticPayment(value)){
            System.out.println("Pagamento realizado com sucesso!");
            System.out.println("O valor de " + super.getValueOfPayment() + " já está em processo de autenticação");
            super.setPaid(true);
            return;
        }
        System.out.println("O pagamento foi recusado porque o limite é insuficiente.");
    }

    public boolean authenticPayment(double value){
        if(value < super.getValueOfPayment()){
            System.out.println("O valor do boleto foi pago de forma completa!");
            return false;
        }
        return true;
    }
}