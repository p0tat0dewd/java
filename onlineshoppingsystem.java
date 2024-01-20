class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }
}

// Usage example
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Create instances for Online Shopping System
        Product product1 = new Product("Laptop", 999.99);
        Customer customer1 = new Customer("John Doe", "john@example.com");
        List<Product> products = new ArrayList<>();
        products.add(product1);

        Order order = new Order(customer1, products);
    }
}
