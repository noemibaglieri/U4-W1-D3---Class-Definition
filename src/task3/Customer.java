package task3;

public class Customer {
    private final int customerId;
    private final String customerName;
    private final String customerLastName;
    private String customerEmail;
    private final String dateOfRegistration;

    public Customer(String name, String lastName, String email) {
        this.customerId = (int)(Math.random() * 1000);
        this.customerName = name;
        this.customerLastName = lastName;
        this.customerEmail = email;
       this.dateOfRegistration = "18/06/2025";
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getDateOfRegistration() {
        return this.dateOfRegistration;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
