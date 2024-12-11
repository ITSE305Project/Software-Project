import java.util.Scanner;

// Data layer
class updateAccount {
    private String firstName; // First Name
    private String lName; // Last Name
    private String password; // Password
    private String email; // Email
    private String pNumber; // Phone Number
    private String location; // location

    // Constructor to initialize a Customer object
    public updateAccount(String firstName, String lName, String password, 
    String email, String pNumber, String location) {
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
    public String getPassword() {return password;}
    public String getPNumber() {return pNumber;}
    public String getLocation() {return location;}

    // Setters for customer details
    public void setFName(String firstName) {this.firstName = firstName;}
    public void setLName(String lastName) {this.lName = lastName;}
    public void setEmail(String email) {this.email = email;}
    public void setPassword(String password) {this.password = password;}
    public void setPNumber(String pNumber) {this.pNumber = pNumber;}
    public void setLocation(String location) { this.location = location;}

                    }
// Business Layer: Class to handle account management
class accountManage {
    private updateAccount updateAccount;

    // Constructor to initialize the AccountManager with a Customer
    public accountManage(updateAccount updateAccount) 
    {this.updateAccount = updateAccount;}

// Presentation Layer
    public void updateAccount() {
        try (Scanner kbd = new Scanner(System.in)) {
            System.out.println("Update your account details (leave blank to keep current value):");

            System.out.print("Enter new first name: ");
            String fName = kbd.nextLine();
            if (!fName.isEmpty())
                updateAccount.setFName(fName);

            System.out.print("Enter new last name: ");
            String lName = kbd.nextLine();
            if (!lName.isEmpty())
                updateAccount.setLName(lName);

            System.out.print("Enter new email: ");
            String email = kbd.nextLine();
            if (!email.isEmpty())
                updateAccount.setEmail(email);

            System.out.print("Enter new phone number: ");
            String pNumber = kbd.nextLine();
            if (!pNumber.isEmpty())
                updateAccount.setPNumber(pNumber);

            System.out.print("Enter new location: ");
            String location = kbd.nextLine();
            if (!location.isEmpty())
                updateAccount.setLocation(location);
        }

        System.out.println("Account updated successfully!");}
}

