import java.util.Scanner;

// Data layer
class updateAccount {
    private String firstName; // First Name
    private String lName; // Last Name
    private int password; // Password
    private String email; // Email
    private int pNumber; // Phone Number
    private String location; // location

    // Constructor to initialize a Customer object
    public updateAccount(String firstName, String lName, int password, 
    String email, int pNumber, String location) {
        this.firstName = firstName;
        this.lName = lName;
        this.password = password;
        this.email = email;
        this.pNumber = pNumber;
        this.location = location;}


    // Getters for customer details
    public String getFName() {return firstName;}
    public String getLName() {return lName;}
    public String getEmail() {return email;}
    public int getPassword() {return password;}
    public int getPNumber() {return pNumber;}
    public String getLocation() {return location;}

    // Setters for customer details
    public void setFName(String firstName) {this.firstName = firstName;}
    public void setLName(String lastName) {this.lName = lastName;}
    public void setEmail(int email) {this.email = email;}
    public void setPassword(int password) {this.password = password;}
    public void setPNumber(String pNumber) {this.pNumber = pNumber;}
    public void setLocation(String location) { this.location = location;}

                    }
// Business Layer: Class to handle account management
class customer {
    private updateAccount customer;

    // Constructor to initialize the AccountManager with a Customer
    public customer(updateAccount customer) 
    {this.customer = customer;}

// Presentation Layer
    public void updateAccount() {
        try (Scanner kbd = new Scanner(System.in)) {
            System.out.println("Update your account details (leave blank to keep current value):");

            System.out.print("Enter new first name: ");
            String fName = kbd.nextLine();
            if (!fName.isEmpty())
                customer.setFName(fName);

            System.out.print("Enter new last name: ");
            String lName = kbd.nextLine();
            if (!lName.isEmpty())
                customer.setLName(lName);

            System.out.print("Enter new email: ");
            String email = kbd.nextLine();
            if (!email.isEmpty())
                customer.setEmail(email);

            System.out.print("Enter new phone number: ");
            String pNumber = kbd.nextLine();
            if (!pNumber.isEmpty())
                customer.setPNumber(pNumber);

            System.out.print("Enter new location: ");
            String location = kbd.nextLine();
            if (!location.isEmpty())
                customer.setLocation(location);
        }

        System.out.println("Account updated successfully!");}
}

