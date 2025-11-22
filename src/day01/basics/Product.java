package day01.basics;

public class Product {
    String brand;
    String productName;
    double price;
    int stockQuantity;

    void displayProductInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }

    boolean isInStock() {
        return stockQuantity > 0;
    }
}
