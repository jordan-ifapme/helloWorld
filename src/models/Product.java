package models;

import java.text.DateFormat;

public class Product {
    private String name;
    private double price;
    private boolean inStock;
    private int discountPercentage;
    public static int globalStockQuantity = 0;
    private static final DateFormat datecreationproduit;

    public Product(String name, double price, boolean inStock, int discountPercentage, DateFormat datecreationproduit) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.discountPercentage = discountPercentage;
        if (inStock)
            Product.globalStockQuantity++;
        this.datecreationproduit = datecreationproduit;
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
