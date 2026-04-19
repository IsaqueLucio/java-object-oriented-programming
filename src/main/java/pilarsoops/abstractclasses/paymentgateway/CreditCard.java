package abstractclasses.paymentgateway;

public class CreditCard extends PaymentMethod{

    private String cardNumber;
    
    public CreditCard(String transactionId, String cardNumber) {
        super(transactionId);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount){
        System.out.println("\nProcessing credit card payment of $" + amount + " for card " + this.cardNumber);
    }

}
