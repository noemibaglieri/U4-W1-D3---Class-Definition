package task1;

public class Task1 {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(20, 80);
        Rectangle secondRectangle = new Rectangle(67, 96);

        Rectangle[] rectangles = {firstRectangle, secondRectangle};

        firstRectangle.printRectangle();
        Rectangle.printTwoRectangles(rectangles);
    }
}
