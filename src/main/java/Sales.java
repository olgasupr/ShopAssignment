import java.util.Scanner;

public class Sales {
    Scanner scanner = new Scanner(System.in);
    Customers customers = new Customers();
    Products products = new Products();
    double totalValueSold = 0;

    public Sales() {
    }

    //Method for buying products
    public void buyProducts() {
        System.out.println("Please enter a customer id, who you wish to make a purchase for.");
        int customerId = scanner.nextInt();
        SingleCustomer singleCustomer = customers.findById(customerId);
        if (singleCustomer != null) {
            System.out.println("You've chosen: " + singleCustomer);
        } else {
            System.out.println("Customer with id " + customerId + " is not found.");
            return;
        }

        System.out.println("\nPlease enter a product id that you wish to purchase for the customer.");
        int productId = scanner.nextInt();
        SingleProduct singleProduct = products.findById(productId);
        if (singleProduct != null) {
            System.out.println("Your chosen product is " + singleProduct.getProductName() + " with the price of " + singleProduct.getPrice() + ".");
        } else {
            System.out.println("Product with id " + productId + " is not found.");
            return;
        }

        System.out.println("\nPlease select a quantity of your chosen product.");
        int quantity = scanner.nextInt();

        if (quantity <= 0) {
            System.out.println("The quantity must be positive.");
            return;
        }

        double totalPrice = singleProduct.getPrice() * quantity;
        if (singleCustomer.getBalance() - totalPrice >= 0 && quantity <= singleProduct.getTotalStock()) {
            double customerBalance = singleCustomer.getBalance() - totalPrice;
            int productStock = singleProduct.getTotalStock() - quantity;
            System.out.println("The purchase is successful. The customer's account will be debited " + totalPrice + ".");
            totalValueSold += totalPrice;
            singleCustomer.setBalance(customerBalance);
            singleProduct.setTotalStock(productStock);
        }
        else if (quantity > singleProduct.getTotalStock()) {
            System.out.println("The quantity of the product is insufficient.");
        }
        else if (singleCustomer.getBalance() - totalPrice < 0) {
            System.out.println("The balance is insufficient.");
        }
        else {
            System.out.println("Invalid input.");
        }

    }

    public void calculateSales() {
        System.out.println("The total value sold is " + totalValueSold + ".");
    }

    public Customers getCustomers() {
        return customers;
    }

    public Products getProducts() {
        return products;
    }
}
