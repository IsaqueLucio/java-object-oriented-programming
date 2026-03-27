package interfaces.system_authentication;

public interface Authenticatable {
    
    boolean login(String username, String password);
    void logout();

}
