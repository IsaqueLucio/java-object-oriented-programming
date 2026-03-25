package abstract_classes.banking_system;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public void withdraw(double amount){
        if(amount > this.balance){
            System.out.println("Insufficient funds!!!");
        } else{
            this.balance = this.balance - amount;
            System.out.println("Sucess! Now the value in your balance is: "+(this.balance));
        }
    }

}
