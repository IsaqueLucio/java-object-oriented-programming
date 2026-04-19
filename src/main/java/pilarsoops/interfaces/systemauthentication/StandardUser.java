package interfaces.systemauthentication;

public class StandardUser implements Authenticatable {

    private String email;
    private boolean userLog;

    public StandardUser(String email) {
        this.email = email;
    }

    @Override
    public boolean login(String username, String password){

        if(password.length() < 6){
            System.out.println("Invalid password, the password must have 6 or more digits.");
            this.userLog = false;
            return false;
        } else{
            System.out.println("Logged in successfully!");
            this.userLog  = true;
        }

        return true;

    }

    @Override
    public void logout(){
        if(this.userLog){
            System.out.println("User logged out securely.");
            this.userLog = false;
        } else System.out.println("You need to be logged in to be able to log out.");
    }

    @Override
    public String toString() {
        return "StandardUser [email=" + email + "]";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isUserLog() {
        return userLog;
    }

    

}
