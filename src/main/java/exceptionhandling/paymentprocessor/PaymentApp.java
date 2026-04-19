package exceptionhandling.paymentprocessor;

import java.util.Scanner;

public class PaymentApp {   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        try{
            PaymentProcessor paymentProcessor = new PaymentProcessor();
            System.out.println("Input the credit card (can't put null or \" \"): ");
            String creditCard = input.nextLine();
            System.out.println("Input the amount (can't be less or equal than 0): ");
            double amount = input.nextDouble();
            paymentProcessor.processPayment(creditCard, amount);
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        } catch(IllegalArgumentException f){
            System.out.println(f.getMessage());
        } finally{
            System.out.println("Closing secure connection to the bank server...");
            input.close();
        }

    }

}
