package task3;

public class Item {
    private final int itemId;
    private String itemDescription;
    private double itemPrice;
    private int availableItems = 0;

    public Item(String itemDescription, int itemPrice) {
        this.itemId = (int)(Math.random() * 1000);
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public void setAvailableItems(int avaiableItems) {
        this.availableItems = avaiableItems;
    }

    public int getAvaiableItems() {
        return availableItems;
    }
}
