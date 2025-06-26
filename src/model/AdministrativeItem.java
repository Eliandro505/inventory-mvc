package model;

import enums.Category;

public class AdministrativeItem extends InventoryItem {
    private int sector;
    private String responsiblePerson;

    public AdministrativeItem(String name, double unitPrice, boolean active, String identifider, Category category, int sector, String responsiblePerson) {
        super(name, unitPrice, active, identifider, category);
        this.sector = sector;
        this.responsiblePerson = responsiblePerson;
    }

    public double calculateTotalValue(int quantity) {
        return (unitPrice * quantity * 1.05);
    }

    public String generateDetailedDescription() {
        StringBuilder builder = new StringBuilder();
        builder.append("Admistrative Item Description\n");
        builder.append("Name: ");
        builder.append(name);
        builder.append("v\nSector: ");
        builder.append(sector);
        builder.append("v\nResponsible Person: ");
        builder.append(responsiblePerson);
        builder.append("v\nIdentifier: ");
        builder.append(identifider);
        return builder.toString();
    }

    public int getSector() {
        return sector;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }
}
