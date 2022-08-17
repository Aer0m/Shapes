package Shapes;

public class Rectangle extends Shape{

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    protected double width, length;

    Rectangle(){}

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    @Override
    double getArea() {

        return (double)Math.round(width*length*100)/100;
    }

    @Override
    double getPerimeter() {

        return (double)Math.round((width+length)*100)/100;
    }

    @Override
    String myToString() {

        return  "Rectangle @(" + color + ", " + isFilled() + ", " + getArea() + ", " + getPerimeter() + ")";
    }
}
