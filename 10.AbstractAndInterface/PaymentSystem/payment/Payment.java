package payment;
import payment.authentication.Authentication;

public abstract class Payment{
    private double valueOfPayment;
    private boolean isPaid = false;

    public Payment(double valueOfPayment) {
        this.valueOfPayment = valueOfPayment;
    }

    public double getValueOfPayment() {
        return valueOfPayment;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public abstract void makePayment(double value);
}