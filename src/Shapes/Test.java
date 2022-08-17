package Shapes;

public class Test {
    public static void main(String[] args){
        //круги
        Shape circ = new Circle();
        ((Circle) circ).setRadius(33);
        circ.setColor("Green");
        circ.setFilled(true);
        System.out.println(circ.getArea());
        System.out.println(circ.getPerimeter());
        System.out.println(circ.getColor());
        System.out.println(circ.isFilled());
        System.out.println(circ.getClass() + "\n");

        Shape circ2 = new Circle(16.5, "Blue", false);
        System.out.println(circ2.getArea());
        System.out.println(circ2.getPerimeter());
        System.out.println(circ2.getColor());
        System.out.println(circ2.isFilled());
        System.out.println(circ2.getClass() + "\n");

        Shape circ3 = new Circle(12.4);
        circ3.setColor("Green");
        circ3.setFilled(true);
        System.out.println(circ3.getArea());
        System.out.println(circ3.getPerimeter());
        System.out.println(circ3.getColor());
        System.out.println(circ3.isFilled());
        System.out.println(circ3.getClass() + "\n");

        //прямоугольники
        Shape rect = new Rectangle();
        ((Rectangle)rect).setWidth(34);
        ((Rectangle) rect).setLength(37);
        rect.setColor("Blue");
        rect.setFilled(true);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getColor());
        System.out.println(rect.isFilled());
        System.out.println(rect.getClass() + "\n");

        Shape rect2 = new Rectangle(23.123, 78.2323, "Violet", true);
        System.out.println(rect2.getArea());
        System.out.println(rect2.getPerimeter());
        System.out.println(rect2.getColor());
        System.out.println(rect2.isFilled());
        System.out.println(rect2.getClass() + "\n");

        Shape rect3 = new Rectangle(68.3443, 89.34);
        rect3.setColor("Black");
        rect3.setFilled(true);
        System.out.println(rect3.getArea());
        System.out.println(rect3.getPerimeter());
        System.out.println(rect3.getColor());
        System.out.println(rect3.isFilled());
        System.out.println(rect3.getClass() + "\n");

        Shape sq = new Square();
        ((Rectangle)sq).setWidth(324.91);
        sq.setColor("Pink");
        sq.setFilled(false);
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());
        System.out.println(sq.getColor());
        System.out.println(sq.isFilled());
        System.out.println(sq.getClass() + "\n");

        Shape sq2 = new Square(472.88);
        sq2.setColor("Yellow");
        sq2.setFilled(true);
        System.out.println(sq2.getArea());
        System.out.println(sq2.getPerimeter());
        System.out.println(sq2.getColor());
        System.out.println(sq2.isFilled());
        System.out.println(sq2.getClass() + "\n");

        Shape sq3 = new Square(67.99, "Red", false);
        System.out.println(sq3.getArea());
        System.out.println(sq3.getPerimeter());
        System.out.println(sq3.getColor());
        System.out.println(sq3.isFilled());
        System.out.println(sq3.getClass());
    }
}
