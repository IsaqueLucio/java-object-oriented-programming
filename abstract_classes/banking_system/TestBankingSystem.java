package abstract_classes.banking_system;

public class TestBankingSystem {
    
    public static void main(String[] args) {
        
        //BankAccount bankAccount = new BankAccount("123456"); compilation error because we cant instance a abstract class

        SavingsAccount savingsAccount = new SavingsAccount("23456");
        CheckingAccount checkingAccount = new CheckingAccount("34567");

        savingsAccount.withdraw(20.0);
        savingsAccount.deposit(50.0);
        savingsAccount.withdraw(30.0);

        checkingAccount.withdraw(30.0);
        checkingAccount.deposit(70.0);
        checkingAccount.withdraw(40.0);

    }

}
