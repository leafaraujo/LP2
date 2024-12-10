package ticket;

public class TopPrivateBox extends VipTicket{
    String localization = "Camarote Superior";

    public TopPrivateBox(double value, double aditionalValue, double topValue){
        super((value + topValue), aditionalValue);
    }

    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("Localização: " + localization);
    }
}
