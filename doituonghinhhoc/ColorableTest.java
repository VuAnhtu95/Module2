package doituonghinhhoc;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2,2);
        shapes[2] = new Square(2);
        for (Shape shape:shapes){
            if (shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            } else {
                System.out.println(shape);
            }
        }
    }
}
