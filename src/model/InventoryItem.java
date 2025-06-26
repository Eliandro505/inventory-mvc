package model;

import enums.Category;

import java.util.concurrent.LinkedBlockingDeque;

public abstract class InventoryItem <I> {
    protected String name;
    protected double unitPrice;
    protected boolean active;
    protected I identifider;
    Category category;

    public InventoryItem(String name, double unitPrice, boolean active, I identifider, Category category) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.active = active;
        this.identifider = identifider;
        this.category = category;
    }

    protected abstract double calculateTotalValue(int quantity);
    protected abstract String generateDetailedDescription();

    public void activate() {
        active = true;
    }

    public void deactivate() {
        active = false;
    }

    public boolean isActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public I getIdentifider() {
        return identifider;
    }

    public void setIdentifider(I identifider) {
        this.identifider = identifider;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
