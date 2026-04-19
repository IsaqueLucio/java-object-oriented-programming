package exceptionhandling.securepasswordvalidator;

public class PasswordValidator {
    
    protected void validate(String password){
        if(password == null || password.length() < 7){
            throw new IllegalArgumentException("Security Error: Password must be at least 7 characters long.");
        } else System.out.println("Password accepted! Saving to database...");
    }

}
