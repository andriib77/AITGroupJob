package de.javalessons.homework29;

public class Circle extends Shape{

   private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    void printResultOfCircle(){
        System.out.println("Circle - Color is " + getColor());
        System.out.println("Radius of circle is  " + getRadius());
        System.out.println("Area of circle is  " + area());
        System.out.println("Perimeter of circle is  " + perimeter());
    }
}
