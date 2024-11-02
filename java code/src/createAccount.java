import java.util.Scanner;

// this class is to represnt customer with his details
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
        String email, String pNumber, String location){
            this.fName = fName;
            this.lName = lName;
            this.username = username;
            this.password = password;
            this.email = email;
            this.pNumber = pNumber;
            this.location = location;
        }

                // this method is to print customer information in readable format
                public String toString(){
                    return "Customer{" +
                                "First Name='" + fName + '\'' +
                                ",Last Name='" + lName + '\'' +
                                ",username='" + username + '\'' +
                                ",email='" + email + '\'' +
                                ",phone Number='" + pNumber + '\'' +
                                ",location='" + location + '\'' +
                                '}';
                }

                public void setEmail(String email2) {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'setEmail'");
                }

                public void setPNumber(String pNumber2) {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'setPNumber'");
                }

                public void setLocation(String location2) {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'setLocation'");
                }

                public void setLName(Object lastName) {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'setLName'");
                }

                public void setFName(Object firstName) {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'setFName'");
                }
}

// this class to hunde account creation process
class createAccount{
    
    // this method to get the input informations from the user
    public static Customer createNewAccount(){
        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String fName = kbd.nextLine();
        System.out.println("Enter your last name:  ");
        String lName = kbd.nextLine();
        System.out.println("Enter your username: ");
        String username = kbd.nextLine();
        System.out.println("Enter your password: ");
        String password = kbd.nextLine();
        System.out.println("Enter your email: ");
        String email = kbd.nextLine();
        System.out.println("Enter your phone number: ");
        String pNumber = kbd.nextLine();
        System.out.println("Enter your location: ");
        String location = kbd.nextLine();
        
        // this to create and return new customer object with the informations that user input it
        return new Customer(fName, lName, username, password, email, pNumber, location);
    }
}


