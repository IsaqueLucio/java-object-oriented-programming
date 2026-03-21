package encapsulation.student_wallet;

public class StudentWallet {
    
    private String studentName;
    private double creditBalance;
    
    public StudentWallet(String studentName) {
        this.studentName = studentName;
        this.creditBalance = 0.0;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void addCredit(double amount){
        this.creditBalance = this.creditBalance + amount;
    }

    public void buySnack(double amount){
        if(this.creditBalance < amount){
            System.out.println("Insufficient funds.");
        } else{
            this.creditBalance = this.creditBalance - amount;
            System.out.println("Purchase approved");
        }
    }

}
