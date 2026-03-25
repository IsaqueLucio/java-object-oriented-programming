package abstract_classes.banking_system;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(String accountNumber) {
        super(accountNumber);
    }
    
    public void withdraw(double amount){
       if(amount > this.balance){
        System.out.println("IInsufficient funds!!!");
       } else{
            this.balance = this.balance-(amount+5.00);
            System.out.println("Success!!! You have withdrawn the value of $ "+amount+
            " this added to the service fee of $5.00 leaves your scale with the current value of $ "
            +this.balance);
       }
    }

}
