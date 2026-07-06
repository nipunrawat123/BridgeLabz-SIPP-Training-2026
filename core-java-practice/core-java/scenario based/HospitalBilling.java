// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBilling {

    // Method to calculate average bill per item
    public static double calculateAverageBill(double totalBill, int items) {
        return totalBill / items;
    }
    public static void processPayment(double billAmount, double paidAmount)
            throws InsufficientFundsException {

        if (paidAmount < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds. Need ₹"
                            + (billAmount - paidAmount) + " more.");
        }

        System.out.println("Payment successful!");
    }

    public static void main(String[] args) {

        String[] patients = {"Rahul", "Priya", "Aman"};
        try {
            double avgBill = calculateAverageBill(5000, 0);
            System.out.println("Average Bill: " + avgBill);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of bill items cannot be zero.");
        }
        try {
            System.out.println("Patient: " + patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index selected.");
        }
        try {
            String input = "ABC123";
            int patientId = Integer.parseInt(input);
            System.out.println("Patient ID: " + patientId);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input provided.");
        }
        try {
            processPayment(10000, 7000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hospital billing system running safely.");
    }
}