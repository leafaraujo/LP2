package  payment.methods;

import payment.authentication.Authentication;
import payment.Payment;

public class PIX extends Payment implements Authentication{

    public PIX(double valueOfPayment) {
        super(valueOfPayment);
    }

    @Override
    public  void makePayment(double value){
        if(this.authenticPayment(value)){
            System.out.println("Pagamento realizado com sucesso!");
            System.out.println("O  PIX no valor de " + super.getValueOfPayment() + " já foi recebido");
            super.setPaid(true);
            return;
        }
        System.out.println("O pagamento foi recusado porque o valor em conta é insuficiente.");
    }

    public boolean authenticPayment(double value){
        if(value < super.getValueOfPayment()){
            System.out.println("O valor do PIX já saiu da conta!");
            return false;
        }
        return true;
    }
}