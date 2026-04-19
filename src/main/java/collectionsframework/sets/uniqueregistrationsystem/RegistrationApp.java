package collectionsframework.sets.uniqueregistrationsystem;

public class RegistrationApp {
    public static void main(String[] args) {
        
        RegistrationManager registrationManager = new RegistrationManager();

        registrationManager.numberOfUsers();

        registrationManager.registerUser("admin");
        registrationManager.registerUser("rootuser");
        registrationManager.registerUser("guest");

        registrationManager.numberOfUsers();

        System.out.println(registrationManager);

        registrationManager.containsUser("admin");
        registrationManager.registerUser("admin");
        registrationManager.deleteUser("admin");
        registrationManager.containsUser("admin");

        System.out.println(registrationManager);

    }
}
