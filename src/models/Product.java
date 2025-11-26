package models;

import java.time.LocalDateTime;
import java.util.Date;

public class Product {
    private String name;
    private double price;
    private boolean inStock;
    private int discountPercentage;
    public static int globalStockQuantity = 0;
    public LocalDateTime dateCreateProduct;

    public Product(String name, double price, boolean inStock, int discountPercentage,  LocalDateTime dateCreateProduct) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.discountPercentage = discountPercentage;
        if (inStock) Product.globalStockQuantity ++;
        this.dateCreateProduct = LocalDateTime.now();
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

    public LocalDateTime getDateCreateProduct() {
        return dateCreateProduct;
    }

    public void setDateCreateProduct(LocalDateTime dateCreateProduct) {
        this.dateCreateProduct = dateCreateProduct;
    }
}
