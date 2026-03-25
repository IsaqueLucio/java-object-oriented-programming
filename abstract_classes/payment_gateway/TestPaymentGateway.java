package abstract_classes.payment_gateway;

import java.util.ArrayList;
import java.util.List;

public class TestPaymentGateway{
    public static void main(String[] args) {
        
        List <PaymentMethod> listPaymentMethods  = new ArrayList<>();

        CreditCard creditCard = new CreditCard("12345", "67890");
        CryptoWallet cryptoWallet = new CryptoWallet("34567", "89012");

        listPaymentMethods.add(cryptoWallet);
        listPaymentMethods.add(creditCard);

        for(PaymentMethod f: listPaymentMethods){
            f.processPayment(100);
        }

    }
}
