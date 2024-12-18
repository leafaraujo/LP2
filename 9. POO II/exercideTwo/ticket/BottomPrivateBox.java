package ticket;

public class BottomPrivateBox extends VipTicket{
    String localization = "Camarote inferior";

    public BottomPrivateBox(double value, double aditionalValue){
        super(value , aditionalValue);
    }

    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("Localização: " + localization);
    }
}
