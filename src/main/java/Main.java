import java.util.Scanner;
import javax.swing.*;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sales sales = new Sales();
        Customers customers = sales.getCustomers();
        Products products = sales.getProducts();

        JFrame f;

        f=new JFrame();
        JOptionPane.showMessageDialog(f, """                      
                Welcome to the Beauty Shop!
                This is a place, where you can find 
                the best beauty products in the market.
                Please select an option: """);

        SingleCustomer customer1 = new SingleCustomer(1, "John", "Smith", 100);
        customers.addCustomer(customer1);
        SingleCustomer customer2 = new SingleCustomer(2, "Mary", "Johnson", 250);
        customers.addCustomer(customer2);
        SingleProduct product1 = new SingleProduct(1, "cream", "face cream", 10, 20 );
        products.addProduct(product1);
        SingleProduct product2 = new SingleProduct(2, "lotion", "face lotion", 20, 20 );
        products.addProduct(product2);

        String input = "";

        do {
            System.out.println("""
                    \n1. Add a customer
                    2. Remove a customer
                    3. View customers and balances
                    4. View a specific customer and balance
                    5. Add a product
                    6. Remove a product
                    7. View all products
                    8. View a specific product and its price
                    9. Buy a product for a customer
                    10. View total value sold
                    11. Quit
                    """);
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    customers.addCustomer();
                    break;
                case "2":
                    customers.removeCustomer();
                    break;
                case "3":
                    customers.viewCustomers();
                    break;
                case "4":
                customers.viewSingleCustomer();
                    break;
                case "5":
                    products.addProduct();
                    break;
                case "6":
                    products.removeProduct();
                    break;
                case "7":
                    products.viewProducts();
                    break;
                case "8":
                    products.viewSingleProduct();
                    break;
                case "9":
                    sales.buyProducts();
                    break;
                case "10":
                    sales.calculateSales();
                    break;
                case "11":
                    System.out.println("Exiting Application");
                    break;
                default:
                    System.out.println("Please input a valid option!");
                    break;
            }

        } while(!input.equals("11"));

    }

}

