package models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Product {
    private String name;
    private double price;
    private boolean inStock;
    private int discountPercentage;
    public static int globalStockQuantity = 0;
    public LocalDateTime DateDeCreation;

    public Product(String name, double price, boolean inStock, int discountPercentage) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.discountPercentage = discountPercentage;
        this.DateDeCreation = LocalDateTime.now();
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
