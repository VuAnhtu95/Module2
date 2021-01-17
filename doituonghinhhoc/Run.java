package doituonghinhhoc;

public class Run {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle(3);
        circles[2] = new Circle(3.5);
        System.out.println("Trước khi tăng :");
        for (Circle circle : circles) {
            double a = (int) circle.getArea();
            System.out.println(a);
        }
        System.out.println("Sau khi tăng : ");
        for (Circle i : circles) {
            double a = (int) i.resize();
            System.out.println(a);
        }
    }
}
