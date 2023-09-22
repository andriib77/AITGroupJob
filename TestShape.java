package de.javalessons.homework29;

public class TestShape {
    public static void main(String[] args) {

        Circle circle = new Circle ("Green", 25.25);
        Rectangle rectagle = new Rectangle("Red", 4.5, 6.0);
        Triangle triangle = new Triangle("Blue", 3.0,3.0,3.0);

        circle.printResultOfCircle();

        System.out.println("--------------");

        rectagle.printResultOfRectangle();

        System.out.println("--------------");

        triangle.printResultOfTriangle();

        System.out.println("--------------");

    }
}
