package property;

public class Property {
    private double value;
    private String adress;

    
    public Property(double value, String adress) {
        this.value = value;
        this.adress = adress;
    }

    public void showInformation(){
        System.out.println("Endereço: " + this.adress);
        System.out.println("Valor: " + this.value);
    }

    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
}
