package task1;

import java.util.Arrays;

public class Rectangle {

    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public int area() {
        return this.length * this.height;
    }

    public int perimeter() {
        return 2 * (this.length + this.height);
    }

    public void printRectangle() {
        System.out.println("Rectangle's height: " + height);
        System.out.println("Rectangle's length: " + length);
        System.out.println("Rectangle's area: " + this.area());
        System.out.println("Rectangle's perimeter: " + this.perimeter());
    }

    public static void printTwoRectangles(Rectangle[] rectangles) {
        int sumPerimeter = 0;
        int sumArea = 0;

        for (Rectangle rectangle : rectangles) {
            rectangle.printRectangle();
            sumPerimeter += rectangle.perimeter();
            sumArea += rectangle.area();
        }

        System.out.println("Area sum: " + sumArea);
        System.out.println("Perimeter sum: " + sumPerimeter);
    }
}
