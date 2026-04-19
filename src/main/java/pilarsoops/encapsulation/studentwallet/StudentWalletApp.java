package encapsulation.studentwallet;

public class StudentWalletApp {
    
    public static void main(String[] args) {
        
        StudentWallet sw1 = new StudentWallet("William");
        sw1.addCredit(50.00);
        sw1.buySnack(20.00);
        sw1.buySnack(40.00);

    }
    

}
