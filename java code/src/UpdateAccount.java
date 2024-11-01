import java.util.Scanner;

// Data Layer: Class to represent a customer with their details
class updateAccount {
    private String firstName; // First Name
    private String lastName; // Last Name
    private int password; // Password
    private String email; // Email
    private int pNumber; // Phone Number
    private String location; // location

    // Constructor to initialize a Customer object
    public updateAccount(String firstName, String lastName, int password, 
                    String email, int pNumber, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.pNumber = pNumber;
        this.location = location;}


    // Getters for customer details
    public String getFName() {return firstName;}
    public String getLName() {return lastName;}
    public String getEmail() {return email;}
    public int getPassword() {return password;}
    public int getPNumber() {return pNumber;}
    public String getLocation() {return location;}

    // Setters for customer details
    public void setFName(String firstName) {this.firstName = firstName;}
    public void setLName(String lastName) {this.lastName = lastName;}
    public void setEmail(String email) {this.email = email;}
    public void setPassword(int password) {this.password = password;}
    public void setPNumber(int pNumber) {this.pNumber = pNumber;}
    public void setLocation(String location) { this.location = location;}

                    }
// Business Layer: Class to handle account management
class AccountManager {
    private Customer customer;

    // Constructor to initialize the AccountManager with a Customer
    public AccountManager(Customer customer) {this.customer = customer;}

    // presentation layer: update account details
    public void updateAccount() {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Update your account details (leave blank to keep current value):");

        System.out.print("Enter new first name: ");
        String fName = kbd.nextLine();
        if (!fName.isEmpty())
            customer.setFName(firstName);

        System.out.print("Enter new last name: ");
        String lName = kbd.nextLine();
        if (!lName.isEmpty())
            customer.setLName(lastName);

        System.out.print("Enter new email: ");
        String email = kbd.nextLine();
        if (!email.isEmpty())
            customer.setEmail(email);

        System.out.print("Enter new phone number: ");
        int pNumber = kbd.nextLine();
        if (!pNumber.isEmpty())
            customer.setPNumber(pNumber);

        System.out.print("Enter new location: ");
        String location = kbd.nextLine();
        if (!location.isEmpty())
            customer.setLocation(location);

        System.out.println("Account updated successfully!");}
    }
}
