package model;

import enums.Category;

public class OfficeItem extends InventoryItem {
    private String material;
    private int packageQuantity;

    public OfficeItem(String name, double unitPrice, boolean active, String identifider, Category category, String material, int packageQuantity) {
        super(name, unitPrice, active, identifider, category);
        this.material = material;
        this.packageQuantity = packageQuantity;
    }

    public double calculateTotalValue(int quantity) {
        return (unitPrice * quantity * 0.95);
    }

    public String generateDetailedDescription() {
        StringBuilder builder = new StringBuilder();
        builder.append("Office Item Description\n");
        builder.append("Material: ");
        builder.append(material);
        builder.append("v\nPackage quantity: ");
        builder.append(packageQuantity);
        builder.append("v\nIdentifier: ");
        builder.append(identifider);
        return builder.toString();
    }

    public String getMaterial() {
        return material;
    }

    public int getPackageQuantity() {
        return packageQuantity;
    }
}
