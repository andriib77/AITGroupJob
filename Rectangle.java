package de.javalessons.homework29;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    void printResultOfRectangle(){
        System.out.println("Rectangle - Color is " + getColor());
        System.out.println("Length of rectangle is  " + getLength());
        System.out.println("Width of rectangle is  " + getWidth());
        System.out.println("Area of rectangle is  " + area());
        System.out.println("Perimeter of rectangle is  " + perimeter());
    }
}

