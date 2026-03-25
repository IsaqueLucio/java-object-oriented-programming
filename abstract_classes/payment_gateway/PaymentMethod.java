package abstract_classes.payment_gateway;

public abstract class PaymentMethod {
    
    protected String transactionId;

    public PaymentMethod(String transactionId) {
        this.transactionId = transactionId;
    }

    public abstract void processPayment(double amount);
    
}
