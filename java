// payment use case
// Presentation Layer for Payment - Responsible for handling user interactions related to payments
class PaymentPresentation {
    // Method to process a payment
    public void processPayment(double amount) {
        // Placeholder method for processing payment in the presentation layer
    }
}

// Business Layer for Payment - Responsible for business logic related to payments
class PaymentBusiness {
    // Method to validate a payment
    public boolean validatePayment(double amount) {
        // Placeholder method for validating payment in the business layer
        return true; // Placeholder return value
    }
}

// Data Layer for Payment - Responsible for data operations related to payments
class PaymentData {
    // Method to save payment details
    public void savePaymentDetails(double amount) {
        // Placeholder method for saving payment details in the data layer
    }
}

// Presentation Layer for Receipt - Responsible for handling user interactions related to receipts
class ReceiptPresentation {
    // Method to generate a receipt
    public void generateReceipt(double amount) {
        // Placeholder method for generating a receipt in the presentation layer
    }
}

// Business Layer for Receipt - Responsible for business logic related to receipts
class ReceiptBusiness {
    // Method to send a receipt via email
    public void sendReceiptEmail(String email) {
        // Placeholder method for sending a receipt via email in the business layer
    }
}

// Data Layer for Receipt - Responsible for data operations related to receipts
class ReceiptData {
    // Method to store receipt information
    public void storeReceiptInformation(double amount, String email) {
        // Placeholder method for storing receipt information in the data layer
    }
}

public class PaymentReceiptUseCase {
    public static void main(String[] args) {
        // Example code to demonstrate the payment and receipt use cases
        PaymentPresentation paymentPresentation = new PaymentPresentation();
        PaymentBusiness paymentBusiness = new PaymentBusiness();
        PaymentData paymentData = new PaymentData();

        double paymentAmount = 100.0;

        if (paymentBusiness.validatePayment(paymentAmount)) {
            paymentPresentation.processPayment(paymentAmount);
            paymentData.savePaymentDetails(paymentAmount);
        }

        ReceiptPresentation receiptPresentation = new ReceiptPresentation();
        ReceiptBusiness receiptBusiness = new ReceiptBusiness();
        ReceiptData receiptData = new ReceiptData();

        receiptPresentation.generateReceipt(paymentAmount);
        receiptBusiness.sendReceiptEmail("example@email.com");
        receiptData.storeReceiptInformation(paymentAmount, "example@email.com");
    }
}
// receipt use case
// Presentation Layer for Receipt - Responsible for handling user interactions related to receipts
class ReceiptPresentation {
    // Method to generate a receipt
    public void generateReceipt(double amount) {
        // Placeholder method for generating a receipt in the presentation layer
    }
}

// Business Layer for Receipt - Responsible for business logic related to receipts
class ReceiptBusiness {
    // Method to send a receipt via email
    public void sendReceiptEmail(String email) {
        // Placeholder method for sending a receipt via email in the business layer
    }
}

// Data Layer for Receipt - Responsible for data operations related to receipts
class ReceiptData {
    // Method to store receipt information
    public void storeReceiptInformation(double amount, String email) {
        // Placeholder method for storing receipt information in the data layer
    }
}

public class ReceiptUseCase {
    public static void main(String[] args) {
        // Example code to demonstrate the receipt use case
        ReceiptPresentation receiptPresentation = new ReceiptPresentation();
        ReceiptBusiness receiptBusiness = new ReceiptBusiness();
        ReceiptData receiptData = new ReceiptData();

        double receiptAmount = 150.0;
        String customerEmail = "example@email.com";

        receiptPresentation.generateReceipt(receiptAmount);
        receiptBusiness.sendReceiptEmail(customerEmail);
        receiptData.storeReceiptInformation(receiptAmount, customerEmail);
    }
}
//end use case
// yusra haji
//202009756

