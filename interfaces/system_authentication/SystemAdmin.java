package interfaces.system_authentication;

public class SystemAdmin implements Authenticatable {

    private String department;
    private boolean userLog;

    public SystemAdmin(String department) {
        this.department = department;
    }

    @Override
    public boolean login(String username, String password){

        if("admin".equals(username) && "root123".equals(password)){
            System.out.println("Logged in successfully!");
            this.userLog = true;
            return true;
        } 
        
        if(!"admin".equals(username) && !"root123".equals(password)){
            System.out.println("Incorrect credentials!");
        } else if( !"admin".equals(username)){
            System.out.println("Incorret username!");
        } else if(!"root123".equals(password)){
            System.out.println("Incorret password!");
        }
        
        this.userLog = false;
        return false;

    }

    @Override
    public void logout(){
        if(this.userLog){
            System.out.println("Admin logged out securely.");
            this.userLog = false;
        } else System.out.println("You need to be logged in to be able to log out.");
    }

    @Override
    public String toString() {
        return "SystemAdmin [department=" + department + ", userLog=" + userLog + "]";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isUserLog() {
        return userLog;
    }

    

}
