package ticket;

public class NormalTicket extends Ticket{

    public NormalTicket(double value){
        super(value);
    }
    
    @Override
    public void showInformation() {
        System.out.println("Valor: " + getValue());
        System.out.println("Bebidas: não inclusas");
        System.out.println("Acesso a áres VIP: não incluso");
        System.out.println("Estacionamento VIP: não incluso");
    }
}
