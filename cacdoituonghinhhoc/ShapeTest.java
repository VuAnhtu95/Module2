package cacdoituonghinhhoc;

public class ShapeTest {
    public static void main(String[] args) {
        Shape test = new Shape();
        System.out.println(test);
        test.setColor("red");
        test.setFilled(false);
        System.out.println(test);
        Circle circle = new Circle();
        System.out.println(circle);
        circle.setRadius(3.5);
        circle.setColor("pink");
        circle.setFilled(false);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle.setLength(30);
        rectangle.setWidth(30);
        rectangle.setColor("blue");
        rectangle.setFilled(true);
        System.out.println(rectangle);
        Square square = new Square();
        System.out.println(square);
    }
}
