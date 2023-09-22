package de.javalessons.homework29;

public class Triangle extends Shape{

    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double area() {
        double s = (side1+side2+side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1+side2+side3;
    }

    void printResultOfTriangle(){
        System.out.println("Triangle - Color is " + getColor());
        System.out.println("Side1 of triangle is  " + getSide1());
        System.out.println("Side2 of triangle is  " + getSide2());
        System.out.println("Side3 of triangle is  " + getSide3());
        System.out.println("Area of circle is  " + area());
        System.out.println("Perimetr of circle is  " + perimeter());
    }
}

