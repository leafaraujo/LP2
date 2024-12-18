import payment.methods.*;



public class App {
    public static void main(String[] args){
        CreditCard cartao = new CreditCard(100.00);
        PaymentSlip boleto = new PaymentSlip(150.00);
        PIX pix = new PIX(200.00);
        System.out.println("-----------------------------------");
        cartao.makePayment(50.00);
        System.out.println("-----------------------------------");
        pix.makePayment(200.00);
        System.out.println("-----------------------------------");
        boleto.makePayment(150.00);
        System.out.println("-----------------------------------");
    }
}