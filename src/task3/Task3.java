package task3;

public class Task3 {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Ted", "Mosby", "ted@gmail.com");

        Item book = new Item("Fourth Wing by Rebecca Yarros", 18);
        book.setAvailableItems(3);

        Item chair = new Item("Lovely pink chair, perfect for your daughter's room", 23);
        chair.setAvailableItems(6);

        Item[] items = {book, chair};

        Cart cart = new Cart(items, customer1);
        System.out.println(cart.getTotalPrice());



    }
}
