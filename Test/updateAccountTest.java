import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UpdateAccountTest {

    private updateAccount account;

    // This method runs before each test to set up the account object
    @BeforeEach
    void setUp() {
        // Creating a sample account with initial data
        account = new updateAccount("Fatima", "Matrook", 123456788,
                "fatima.mt@email.com", 34567890, "Bahrain"); }

    @Test
    void testConstructor() {
        // Test that the constructor correctly sets all fields
        assertEquals("Fatima", account.getFName());
        assertEquals("Matrook", account.getLName());
        assertEquals(123456788, account.getPassword());
        assertEquals("fatima.mt@email.com", account.getEmail());
        assertEquals(34567890, account.getPNumber());
        assertEquals("Bahrain", account.getLocation());
    }

    @Test
    void testPasswordValidation() {
        // Example of a simple test for password validation (if any)
        // Let's assume you want to check that the password is a positive integer.
        assertTrue(account.getPassword() > 0, "Password should be positive");
    }

    @Test
    void testEmailFormat() {
        // Example test to check if email follows a basic format
        assertTrue(account.getEmail().contains("@"), "Email should contain '@'");
    }

    @Test
    void testPhoneNumber() {
        // Test the phone number field
        assertTrue(String.valueOf(account.getPNumber()).length() == 8,
                "Phone number should be 8 digits");
    }
}
