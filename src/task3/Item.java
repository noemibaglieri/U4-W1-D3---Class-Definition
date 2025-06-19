package task3;

public class Item {
    private final int id;
    private String description;
    private double price;
    private int availableItems = 0;

    public Item(String itemDescription, int itemPrice) {
        this.id = (int)(Math.random() * 1000);
        this.description = itemDescription;
        this.price = itemPrice;
    }

    public void setAvailableItems(int avaiableItems) {
        this.availableItems = avaiableItems;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvaiableItems() {
        return this.availableItems;
    }
}
