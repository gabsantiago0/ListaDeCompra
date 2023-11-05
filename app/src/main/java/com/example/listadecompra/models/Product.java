package com.example.listadecompra.models;

import android.database.sqlite.SQLiteDatabase;

import java.util.Objects;

public class Product {

    private int id;
    private String description;
    private int amount;
    private double price;

    public Product(int id, String description, int amount, double price) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && amount == product.amount && Double.compare(product.price, price) == 0 && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, amount, price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product:");
        sb.append("id=").append(id);
        sb.append(", description='").append(description).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", price=").append(price);
        sb.append('\n');
        return sb.toString();
    }
}
