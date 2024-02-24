class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}

class Books extends Product {
    private String author;

    public Books(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 999999, "Dell");
        Clothing shirt = new Clothing("T-shirt", 1999, "M");
        Books book = new Books("Java Programming", 29999, "meowmeow");

        System.out.println("Product: " + laptop.getName() + ", Brand: " + laptop.getBrand() + ", Price: " + laptop.getPrice());
        System.out.println("Product: " + shirt.getName() + ", Size: " + shirt.getSize() + ", Price: " + shirt.getPrice());
        System.out.println("Product: " + book.getName() + ", Author: " + book.getAuthor() + ", Price: " + book.getPrice());
    }
}
