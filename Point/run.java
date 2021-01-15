package Point;

public class run {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(4);
        point.setY(5);
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setX(6);
        moveablePoint.setY(9);
        moveablePoint.setxSpeed(9);
        moveablePoint.setySpeed(6);
        Point a =  moveablePoint.move();
        System.out.println(a);
    }
}
