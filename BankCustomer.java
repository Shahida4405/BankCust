public class BankCustomer {
    String custName;
    int custId;
    String address;

    public BankCustomer(String custName, int custId, String address) {
        this.custName = custName;
        this.custId = custId;
        this.address = address;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer ID: " + custId);
        System.out.println("Address: " + address);
    }
}