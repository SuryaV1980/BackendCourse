package com.javaExercise;

public class Product {

    int productId;
    String productName;
    double price;

    Product() {
        productId = 0;
        productName = "Unknown";
        price = 0.0;
    }

    Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
        price = 0.0;
    }

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("                  ");
    }

    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop");
        Product p3 = new Product(102, "Headphones", 2500);

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
    }
}