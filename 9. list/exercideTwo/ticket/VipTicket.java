package ticket;

public class VipTicket extends Ticket{

    public VipTicket(double value, double aditionalValue){
        super(value + aditionalValue);
    }
    
    @Override
    public void showInformation() {
        System.out.println("Valor: " + getValue());
        System.out.println("Bebidas: inclusas");
        System.out.println("Acesso a áres VIP: incluso");
        System.out.println("Estacionamento VIP: incluso");
    }
}