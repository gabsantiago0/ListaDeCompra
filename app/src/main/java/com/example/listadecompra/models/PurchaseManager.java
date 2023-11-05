package com.example.listadecompra.models;

import java.util.ArrayList;

public class PurchaseManager {
    private ArrayList<PurchaseLine> purchaseLines;
    private boolean isPaid;

    public PurchaseManager() {
        this.purchaseLines = new ArrayList<>();
        this.isPaid = false;
    }

    public void addPurchaseLine(PurchaseLine line) {
        purchaseLines.add(line);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (PurchaseLine line : purchaseLines) {
            total += line.getTotalPrice();
        }
        return total;
    }

    public String doublePay(double amount) {
        double total = calculateTotal();
        if (amount >= total) {
            return String.valueOf(amount - total);
        } else {
            String insufficient = "No has introducido suficiente dinero, restante: " + (total - amount) + " $";
            return insufficient;
        }
    }

    public void clearPurchase() {
        if (isPaid) {
            purchaseLines.clear();
        }

    }
}
