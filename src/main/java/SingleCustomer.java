public class SingleCustomer {
    private int customerId;
    private String name;
    private String surname;
    private double balance;

    public SingleCustomer(int customerId, String name, String surname, double balance) {
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public SingleCustomer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "The customer with an id " + customerId +
                " is " + name + " " + surname + ", whose current balance is "
                + balance + ".";
    }
}
