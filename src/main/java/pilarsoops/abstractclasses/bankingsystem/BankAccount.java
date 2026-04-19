package abstractclasses.bankingsystem;

public abstract class BankAccount {
    
    protected String accountNumber;
    protected double balance = 0.0;

    public BankAccount(String accountNumber){

        this.accountNumber = accountNumber;

    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("You can't deposit nothing or a negative value!!!");
        } else System.out.println("Sucess! Now the value in your balance is: "+(this.balance = this.balance+amount));
    }

    public abstract void withdraw(double amount);


    
}
