package day01.basics;

public class Product {
    private String brand;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product() {
        this.brand = "Unknown";
        this.productName = "Unknown";
        this.price = 0.0;
        this.stockQuantity = 0;
    }

    public Product(String brand, String productName, double price, int stockQuantity) {
        this.brand = brand;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getBrand() {
        return brand;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        } else {
            System.out.println("Stock quantity can't be negative.");
        }
    }

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
