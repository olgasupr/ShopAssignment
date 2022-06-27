import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Customers {
    Scanner scanner = new Scanner(System.in);
    Scanner scannerNum = new Scanner(System.in);

    ArrayList<SingleCustomer> customers = new ArrayList<SingleCustomer>();

    //Method for adding a customer
    void addCustomer() {
        System.out.println("Please enter a customer's ID.");
        int customerId = scannerNum.nextInt();
        System.out.println("Please enter a customer's name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter a customer's surname: ");
        String surname = scanner.nextLine();
        System.out.println("Please enter a customer's balance: ");
        double balance = scannerNum.nextDouble();

        SingleCustomer singleCustomer = new SingleCustomer(customerId, name, surname, balance);
        addCustomer(singleCustomer);
    }

    public void addCustomer(SingleCustomer singleCustomer)
    {
        customers.add(singleCustomer);
        System.out.println("The customer id " + singleCustomer.getCustomerId() +
                " (" + singleCustomer.getName() + " " + singleCustomer.getSurname() + ")" + " added successfully.");
    }


    //Method for removing a customer
    void removeCustomer() {
        System.out.println("Please enter a customer's ID to be removed.");
        int customerId = scannerNum.nextInt();
        SingleCustomer singleCustomer = findById(customerId);
        if (!singleCustomer.equals(null)) {
            customers.remove(singleCustomer);
            System.out.println("The customer id " + customerId + " removed successfully.");
        }
    }

    //Method for viewing all customers
    public ArrayList<SingleCustomer> viewCustomers () {
        System.out.println(customers);
        return customers;
    }


    //Method for viewing a single customer
    public SingleCustomer viewSingleCustomer () {
        System.out.println("Please enter a customer id you want to view.");
        int customerId = scannerNum.nextInt();
        SingleCustomer singleCustomer = findById(customerId);
        if (!singleCustomer.equals(null)) {
            System.out.println(singleCustomer);
            return singleCustomer;
        }
        return null;
    }

    public SingleCustomer findById(int customerId) {
        for (SingleCustomer singleCustomer : customers) {
            if (customerId == singleCustomer.getCustomerId()) {
                return singleCustomer;
            }
        }
        return null;
    }



}
