package exceptionhandling.paymentprocessor;

public class PaymentProcessor {
    
    public void processPayment(String creditCard, double amount){
        if(creditCard == null || creditCard.equals("")){
            throw new NullPointerException("Payment Error: Credit card details cannot be null.");
        } 
        
        if(amount <= 0){
            throw new IllegalArgumentException("Payment Error: Transaction amount must be greater than zero.");
        } else System.out.println("Payment of $" + amount + " processed successfully.");
    }

}
