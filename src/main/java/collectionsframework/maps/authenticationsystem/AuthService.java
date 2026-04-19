package collectionsframework.maps.authenticationsystem;

import java.util.HashMap;
import java.util.Map;

public class AuthService {
    
    private Map<String, String> credentials = new HashMap<>();
    private Map<String, Boolean> userLoggedIn = new HashMap<>();

    public AuthService(){
        credentials.put("admin", "12345");
        credentials.put("Smith", "password");
    }

    private boolean isCredentialsValid(String user, String password) throws AuthenticationException{
        if(user == null && password == null){
            throw new AuthenticationException("\"The user and password must to be inform!\"");
        }
        if(user==null || user.isBlank()){
            throw new AuthenticationException("\"The user must to be inform!\"");
        }
        if(password==null || password.isBlank()){
            throw new AuthenticationException("\"The password must to be inform!\"");
        }
        if(!credentials.containsKey(user)){
            throw new AuthenticationException("The user "+user+" does not exist!");
        }
         if(!password.equals(credentials.get(user))){
            throw new AuthenticationException("Wrong password!");
        }
        return true;
    }

    public void logIn(String user, String password) throws AuthenticationException{
        isCredentialsValid(user, password);
        if(userLoggedIn.get(user) !=  null){    
            throw new AuthenticationException("The user "+user+" is already logged in!");
        }
        userLoggedIn.put(user, true);
        System.out.println("Ok, login successful!");
    }

    public void logOut(String user){
        if(Boolean.TRUE.equals(userLoggedIn.get(user))){
            userLoggedIn.remove(user);
            System.out.println("User "+user+" is now log out.");
        } else{
            System.out.println("You are not logged in, so you cannot logout.");
        }
    }

    public void addNewUser(String newUser, String password) throws AuthenticationException{
        if(newUser == null || newUser.isBlank() || password == null || password.isBlank()){
            throw new AuthenticationException("The user and password must to be inform!");
        }
        if(credentials.get(newUser) == null){
            System.out.println("New user "+newUser+" added to the list!");
            credentials.put(newUser, password);
        } else{
            throw new AuthenticationException("The  user "+newUser+" already exists!");
        }
    }

    public void removeUser(String user, String password) throws AuthenticationException{
        isCredentialsValid(user, password);
        if(!Boolean.TRUE.equals(userLoggedIn.get(user))){
            throw new AuthenticationException("To perform this action, you need to be logged in.");
        }
        credentials.remove(user, password);
        System.out.println("The user "+user+" has been removed of the list.");
        userLoggedIn.remove(user    );
    }
        

}
