import java.util.Scanner;
import java.util.regex.Pattern;

// This class represents a customer with their details
class Customer {
    private String fName; // First Name
    private String lName; // Last Name
    private String username;
    private String password;
    private String email;
    private String pNumber; // Phone Number
    private String location;

    // Constructor to initialize a new Customer object
    public Customer(String fName, String lName, String username, String password,
                    String email, String pNumber, String location) {
        this.fName = fName;
        this.lName = lName;
        this.username = username;
        setPassword(password); // Validate password
        setEmail(email);       // Validate email
        this.pNumber = pNumber;
        this.location = location;
    }

    // Getters and Setters
    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return "****"; // Mask password for external access
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        this.email = email;
    }

    public String getPNumber() {
        return pNumber;
    }

    public void setPNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Method to validate email format using regex
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(emailRegex, email);
    }

    // Method to print customer information in a readable format
    @Override
    public String toString() {
        return "Customer{" +
                "First Name='" + fName + '\'' +
                ", Last Name='" + lName + '\'' +
                ", Username='" + username + '\'' +
                ", Email='" + email + '\'' +
                ", Phone Number='" + pNumber + '\'' +
                ", Location='" + location + '\'' +
                '}';
    }
}

// This class handles the account creation process
class createAccount {

    // This method gets the input information from the user
    public static Customer createNewAccount() {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String fName = kbd.nextLine();
        System.out.println("Enter your last name: ");
        String lName = kbd.nextLine();
        System.out.println("Enter your username: ");
        String username = kbd.nextLine();
        System.out.println("Enter your password (at least 8 characters): ");
        String password = kbd.nextLine();
        System.out.println("Enter your email: ");
        String email = kbd.nextLine();
        System.out.println("Enter your phone number: ");
        String pNumber = kbd.nextLine();
        System.out.println("Enter your location: ");
        String location = kbd.nextLine();

        // Create and return a new customer object with the information provided by the user
        return new Customer(fName, lName, username, password, email, pNumber, location);
    }
}
