package interfaces.systemauthentication;

public interface Authenticatable {
    
    boolean login(String username, String password);
    void logout();

}
