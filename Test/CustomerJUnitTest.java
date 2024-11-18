import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class CustomerJUnitTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        var customer = new Customer("Ahmed", "Raed", "alwadyani", "123123", "ahmed@uob.com", "12345678", "Bahrain");
        assertEquals("Customer{First Name='Ahmed',Last Name='Raed',username='alwadyani',email='ahmed@uob.com',phone Number='12345678',location='Bahrain'}",customer.toString());

    }

    @Test
    void testCreateNewAccount() {
        String simulatedInput = "Ahmed\nRaed\nalwadyani\npassword111\nahmed@uob.com\n12345678\nBahrain\n";



        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        var customer = createAccount.createNewAccount();
        //assertEquals("Customer{First Name='Ahmed',Last Name='Raed',username='alwadyani',email='ahmed@uob.com',phone Number='12345678',location='Bahrain'}",customer);
        assertTrue(customer.toString().contains("Customer{First Name='Ahmed',Last Name='Raed',username='alwadyani',email='ahmed@uob.com',phone Number='12345678',location='Bahrain'}") );

    }

}