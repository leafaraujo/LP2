package property;

public class OldProperty extends Property{
    double discount = 0.0;

    public OldProperty(double value, String adress, double discount) {
        super(value, adress);
        this.discount = discount;
        double  oldValue = super.getValue();
        super.setValue(oldValue - discount);
    }

    @Override
    public void showInformation() {
        System.out.println("Valor original: " + (super.getValue() + discount));
        System.out.println("Valor do desconto: " + this.discount);
        super.showInformation();
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
