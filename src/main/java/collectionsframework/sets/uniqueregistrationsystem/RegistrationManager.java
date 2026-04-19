package collectionsframework.sets.uniqueregistrationsystem;

import java.util.HashSet;
import java.util.Set;

public class RegistrationManager {
    
    private Set<String> registredUsers = new HashSet<>();

    public void registerUser(String username){
        if(registredUsers.add(username)){
            System.out.println("User "+username+" registered successfully.");
        } else System.out.println("Error: Username "+username+" is already taken!");
    }

    public void numberOfUsers(){
        if(registredUsers.isEmpty()){
            System.out.println("There no users registereds.");
        } else System.out.println("There users registereds.");
    }

    public void containsUser(String username){
        if(registredUsers.contains(username)){
            System.out.println("Yes, the user "+username+" is registred.");
        } else System.out.println("There no user with the username "+username+".");
    }

    public void deleteUser(String username){
        if(registredUsers.remove(username)){
            System.out.println("User "+username+" deleted successfully.");
        } else System.out.println("Error: Username "+username+" not find!");
    }

    @Override
    public String toString() {
        return "RegistrationManager [registredUsers=" + registredUsers + "]";
    }

    

}
