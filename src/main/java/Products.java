import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Products {
    Scanner scanner = new Scanner(System.in);
    Scanner scannerNum = new Scanner(System.in);

    ArrayList<SingleProduct> products = new ArrayList<SingleProduct>();

    //Method for adding a product
    void addProduct() {
        System.out.println("Please enter the product id.");
        int productId = scannerNum.nextInt();
        System.out.println("Please enter the product name.");
        String productName = scanner.nextLine();
        System.out.println("Please enter the product type.");
        String productType = scanner.nextLine();
        System.out.println("Please enter the product price.");
        double price = scannerNum.nextDouble();
        System.out.println("Please enter a total stock of the product.");
        int totalStock = scannerNum.nextInt();

        SingleProduct singleProduct = new SingleProduct(productId, productName, productType, price, totalStock);

        addProduct(singleProduct);
    }

    public void addProduct(SingleProduct singleProduct) {
        products.add(singleProduct);
        System.out.println("The product id " + singleProduct.getProductId() + " (" + singleProduct.getProductName() + ") added successfully.");
    }

    //Method for removing a product
    void removeProduct() {
        System.out.println("Please enter the product id you wish to remove.");
        int productId = scannerNum.nextInt();
        SingleProduct singleProduct = findById(productId);
        if (!singleProduct.equals(null)) {
            products.remove(singleProduct);
            System.out.println("The product id " + productId + " removed successfully.");
        }
    }

    //Method for viewing products
    ArrayList<SingleProduct> viewProducts () {
        System.out.println(products);
        return products;
    }

    //Method for viewing a single product
    public SingleProduct viewSingleProduct () {
        System.out.println("Please enter a product id you want to view.");
        int productId = scannerNum.nextInt();
        SingleProduct singleProduct = findById(productId);
        if (!singleProduct.equals(null)) {
            System.out.println(singleProduct);
            return singleProduct;
        }
        return null;

    }
    public SingleProduct findById(int productId) {
        for (SingleProduct singleProduct: products) {
            if (productId == singleProduct.getProductId()) {
                return singleProduct;
            }
        }
        return null;
    }

}
