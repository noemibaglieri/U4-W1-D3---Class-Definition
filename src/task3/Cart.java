package task3;

public class Cart {
    private Item[] items;
    private Customer customer;
    private final double totalPrice;

public Cart(Item[] items, Customer customer){
    this.items = items;
    this.customer = customer;

    double totalPrice = 0;
    for(Item item : items) {
        totalPrice += item.getPrice();
    }
    this.totalPrice = totalPrice;
}

    public double getTotalPrice() {
        return this.totalPrice;
    }
}
