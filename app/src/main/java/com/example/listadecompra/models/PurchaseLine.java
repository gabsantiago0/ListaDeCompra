package com.example.listadecompra.models;

public class PurchaseLine {
    private int id;
    private Product product;
    private int quantity; //Cantidad

    public PurchaseLine(int id, Product product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }

    //Metodo para calcular el precio total
    public double getTotalPrice(){
        return product.getPrice()*quantity;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
