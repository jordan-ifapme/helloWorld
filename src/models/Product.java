package models;

public class // Product.java
import java.time.LocalDateTime;

public class Product {
    private LocalDateTime DateDeCreation;

    public Product() {
        this.DateDeCreation = LocalDateTime.now();
    }

    public Product(LocalDateTime DateDeCreation) {
        this.DateDeCreation = DateDeCreation;
    }

    public LocalDateTime getDateDeCreation() {
        return DateDeCreation;
    }

    public void setDateDeCreation(LocalDateTime DateDeCreation) {
        this.DateDeCreation = DateDeCreation;
    }
}Product {
    private String name;
    private double price;
    private boolean inStock;
    private int discountPercentage;
    public static int globalStockQuantity = 0;

    public Product(String name, double price, boolean inStock, int discountPercentage) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.discountPercentage = discountPercentage;
        if (inStock) Product.globalStockQuantity ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
