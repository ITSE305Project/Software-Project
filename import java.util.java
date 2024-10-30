import java.util.Scanner;

public class UpdateAccount {
    private int id;
    private String email;
    private String mobile;

    public UpdateAccount(int id, String email, String mobile) {
        this.id = id;
        this.email = email;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

/* The Data layer */
class AccountData {
    private UpdateAccount[] accountDatabase;
    private int accountCount;

    // Maximum number of accounts
    private static final int MAX_ACCOUNTS = 10;

    public AccountData(Scanner scanner) {
        this.accountDatabase = new UpdateAccount[MAX_ACCOUNTS];
        this.accountCount = 0;
        addSampleAccounts();
    } // Sample data for demonstration

    private void addSampleAccounts() {
        accountDatabase[accountCount++] = new UpdateAccount(1, "user1@example.com", "1234567890");
        accountDatabase[accountCount++] = new UpdateAccount(2, "user2@example.com", "0987654321");
    }

    public UpdateAccount getAccountById(int accountId) {
        for (int i = 0; i < accountCount; i++) {
            if (accountDatabase[i].getId() == accountId) {
                return accountDatabase[i];
            }
        }
        return null;
    }

    public void saveAccount(UpdateAccount account) {
        for (int i = 0; i < accountCount; i++) {
            if (accountDatabase[i].getId() == account.getId()) {
                accountDatabase[i] = account; // Update existing account
                return;
            }
        }

        // If the account does not exist, add it if there's space
        if (accountCount < MAX_ACCOUNTS) {
            accountDatabase[accountCount++] = account;
        }

        /* The Presentation layer */
        class AccountPresentation {
            private AccountBusiness accountBusiness;
            private Scanner scanner = new Scanner(System.in);

            public AccountPresentation(AccountBusiness accountBusiness) {
                this.accountBusiness = accountBusiness;
            }

            /* Displays the menu for update the account information */
            public void updateAccount() {
                System.out.println("Update Account Information");
                System.out.print("Enter your account ID: ");
                int accountId = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.print("Enter your new email: ");
                String newEmail = scanner.nextLine();

                System.out.print("Enter your new mobile number: ");
                String newMobile = scanner.nextLine();

                // Update the account information
                boolean isUpdated = accountBusiness.updateAccount(accountId, newEmail, newMobile);

                if (isUpdated) {
                    System.out.println("Account information updated successfully");
                } else {
                    System.out.println("Failed to update yur account information. Please check your account ID again.");
                }
            }
        }
    }
}
