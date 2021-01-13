package Accessmodifier;

public class run {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(9);
        circle.getRadius();
        double a = circle.getArea();
        System.out.println(a);
    }
}
