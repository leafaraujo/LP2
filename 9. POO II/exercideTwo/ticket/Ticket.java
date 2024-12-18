package ticket;

public abstract class Ticket {
    private double value = 0.0;
    private boolean allowDrinks = false;
    private boolean allowVipAcess = false;
    private boolean allowVipParking = false;

    public abstract void showInformation();


    public Ticket(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

    public boolean isAllowDrinks() {
        return allowDrinks;
    }


    public void setAllowDrinks(boolean allowDrinks) {
        this.allowDrinks = allowDrinks;
    }


    public boolean isAllowVipAcess() {
        return allowVipAcess;
    }


    public void setAllowVipAcess(boolean allowVipAcess) {
        this.allowVipAcess = allowVipAcess;
    }


    public boolean isAllowVipParking() {
        return allowVipParking;
    }


    public void setAllowVipParking(boolean allowVipParking) {
        this.allowVipParking = allowVipParking;
    }
    
}
