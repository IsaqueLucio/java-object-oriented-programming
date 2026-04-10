package collections_framework.sets.unique_registration_system;

public class TestRegistration {
    public static void main(String[] args) {
        
        RegistrationManager registrationManager = new RegistrationManager();

        registrationManager.numberOfUsers();

        registrationManager.registerUser("admin");
        registrationManager.registerUser("root_user");
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
