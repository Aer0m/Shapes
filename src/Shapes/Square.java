package Shapes;

public class Square extends Rectangle{
    Square(){}

    Square(double side){
        this.width = side;
        this.length = side;
    }

    Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    @Override
    String myToString() {

        return  "Square @(" + color + ", " + isFilled() + ", " + getArea() + ", " + getPerimeter() + ")";
    }
}
