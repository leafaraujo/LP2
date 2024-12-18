package property;

public class NewProperty extends Property{
    private double additionalValue = 0.0;

    public NewProperty(double value, String adress, double additionalValue){
        super(value, adress);
        this.additionalValue = additionalValue;
        double oldValue = super.getValue();
        super.setValue(oldValue + additionalValue);
    }

    @Override
    public void showInformation(){
        System.out.println("Valor original: " + (super.getValue() - additionalValue));
        System.out.println("Valor adicional: " + this.additionalValue);
        super.showInformation();
    }

    public double getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(double additionalValue) {
        this.additionalValue = additionalValue;
    }

}
