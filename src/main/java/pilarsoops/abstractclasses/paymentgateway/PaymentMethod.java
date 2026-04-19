package abstractclasses.paymentgateway;

public abstract class PaymentMethod {
    
    protected String transactionId;

    public PaymentMethod(String transactionId) {
        this.transactionId = transactionId;
    }

    public abstract void processPayment(double amount);
    
}
