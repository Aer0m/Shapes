package Shapes;

public class Circle extends Shape{

    protected double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }

    Circle() {}

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    @Override
    double getArea() {
        return (double)Math.round(Math.PI*radius*radius*100)/100;
    }

    @Override
    double getPerimeter() {
        return (double)Math.round(2*Math.PI*radius*100)/100;
    }

    @Override
    String myToString() {
        return "Circle @(" + color + ", " + isFilled() + ", " + getArea() + ", " + getPerimeter() + ")";
    }
}
