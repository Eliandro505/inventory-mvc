package model;

import enums.Category;

public class EletronicItem extends InventoryItem {
    private int voltage;
    private String brand;

    public EletronicItem(String name, double unitPrice, boolean active, int identifider, Category category, int voltage, String brand) {
        super(name, unitPrice, active, identifider, category);
        this.voltage = voltage;
        this.brand = brand;
    }

    public double calculateTotalValue(int quantity) {
        return (unitPrice * quantity);
    }

    public String generateDetailedDescription() {
        StringBuilder builder = new StringBuilder();
        builder.append("Eletronic Item Description\n");
        builder.append("Name: ");
        builder.append(name);
        builder.append("\nVoltage: ");
        builder.append(voltage);
        builder.append("v\nBrand: ");
        builder.append(brand);
        builder.append("v\nIdentifier: ");
        builder.append(identifider);
        return builder.toString();
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
