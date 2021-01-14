package CircleCylinder;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("pink");
        circle.setRadius(3.5);
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        cylinder.setWidth(20.0);
        cylinder.setColor("hồng");
        System.out.println(cylinder);
    }
}
