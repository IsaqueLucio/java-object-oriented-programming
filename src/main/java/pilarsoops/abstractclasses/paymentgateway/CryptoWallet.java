package abstractclasses.paymentgateway;

public class CryptoWallet extends PaymentMethod {

    private String walletAddress;

    public CryptoWallet(String transactionId, String walletAddress) {
        super(transactionId);
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("\nTransferring $" + amount + " in crypto to wallet " + this.walletAddress);
    }
    
}
