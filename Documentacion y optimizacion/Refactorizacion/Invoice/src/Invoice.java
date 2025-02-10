public class Invoice {
    private int invoiceNumber;
    private String customerName;
    private double subTotal;
    private double tax;

    public Invoice(int invoiceNumber, String customerName, double subTotal) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.subTotal = subTotal;
    }

    public void printInvoiceSummary() {
        System.out.println("Invoice Details:");
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Amount: " + subTotal);
        System.out.println("Tax Amount: " + tax);
        System.out.println("Amount with Tax: " + (subTotal + tax));
    }
    public double calculatetax(int num) {
        return this.tax = num * 0.15;
    }

    public double getTotalAmountWithTax() {
        return subTotal + tax;
    }

    public void updateCustomerName(String newName) {
        customerName = newName;
    }

    public void applyDiscountAndUpdateTax(double discountPercentage) {
        subTotal = subTotal - (subTotal * discountPercentage / 100);
        tax = subTotal * 0.15;
    }

    public void printDiscountDetails() {
        System.out.println("Discount Applied: " + subTotal);
        System.out.println("New Tax Amount: " + tax);
        System.out.println("Amount After Discount: " + (subTotal + tax));
    }
}