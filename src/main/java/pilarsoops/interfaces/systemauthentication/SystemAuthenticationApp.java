package interfaces.systemauthentication;

public class SystemAuthenticationApp {
    public static void main(String[] args) {
        
       SystemAdmin admin1 = new SystemAdmin("Design");
       StandardUser user1 = new StandardUser("user01@gmail.com");

       admin1.login("admin", "root123");
       admin1.logout();
       admin1.login("wrong", "wrong");
       admin1.logout();
       admin1.login("admin", "wrong");
       admin1.logout();
       admin1.login("wrong", "root123");
       admin1.logout();
     
       user1.login("user1", "123");
       user1.logout();
       user1.login("user1", "123456");
       user1.logout();

    }
}
