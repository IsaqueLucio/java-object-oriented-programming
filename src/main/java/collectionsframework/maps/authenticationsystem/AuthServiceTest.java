package collectionsframework.maps.authenticationsystem;

public class AuthServiceTest {

    public static void main(String[] args) {
        AuthService auth = new AuthService();

        System.out.println("\n--- Starting Revised AuthService Tests ---");

        // --- TEST 1: The "Removal Without Login" Block ---
        try {
            System.out.print("\nTest Removal While Logged Out: ");
            auth.removeUser("Smith", "password");
            System.out.println("FAILED (User should not be able to remove without being logged in)");
        } catch (AuthenticationException e) {
            System.out.println("PASSED (Caught expected exception: " + e.getMessage() + ")");
        }

        // --- TEST 2: Successful Removal Cycle ---
        try {
            System.out.print("\nTest Successful Removal: ");
            auth.logIn("Smith", "password"); // Must login first now!
            auth.removeUser("Smith", "password");
            System.out.println("PASSED");
        } catch (Exception e) {
            System.out.println("FAILED: " + e.getMessage());
        }

        // --- TEST 3: The "Ghost" Removal ---
        // What happens if we try to remove someone who doesn't exist?
        try {
            System.out.print("\nTest Remove Non-Existent User: ");
            auth.removeUser("UnknownUser", "123");
            System.out.println("FAILED (Should throw 'User does not exist')");
        } catch (AuthenticationException e) {
            System.out.println("PASSED (Caught: " + e.getMessage() + ")");
        }

        // --- TEST 4: Input Filter - The Null/Blank Traps ---
        String[][] badInputs = {
            {null, "123"},
            {"admin", null},
            {"", "123"},
            {"admin", "   "}
        };

        for (String[] input : badInputs) {
            try {
                System.out.print("\nTest Bad Input [" + input[0] + " / " + input[1] + "]: ");
                auth.logIn(input[0], input[1]);
                System.out.println("FAILED (Input filter let a bad value pass)");
            } catch (AuthenticationException e) {
                System.out.println("PASSED (Blocked correctly)");
            }
        }

        // --- TEST 5: Double Login Attempt ---
        try {
            System.out.print("\nTest Double Login: ");
            auth.logIn("admin", "12345");
            auth.logIn("admin", "12345");
            System.out.println("FAILED (Should have blocked second login)");
        } catch (AuthenticationException e) {
            System.out.println("PASSED (Blocked duplicate session)");
        }

        // --- TEST 6: Logout of Non-Logged-In User ---
        System.out.print("\nTest Logout Without Session: ");
        auth.logOut("RandomUser"); 
        // Should print your "You are not logged in" message.

        System.out.println("\n--- All Tests Concluded ---");
    }
}
