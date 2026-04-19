package exceptionhandling.securepasswordvalidator;

import java.util.Scanner;

public class ValidatorApp{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        boolean isValid = false;

        while(!isValid){
            try{
                System.out.println("Input the password (more than 6 digits): ");
                String password = input.nextLine();
                PasswordValidator validator = new PasswordValidator();
                validator.validate(password);
                isValid = true;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        input.close();
    }

}
