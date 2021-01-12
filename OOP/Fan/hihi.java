package OOP.Fan;

public class hihi {
    public static void main(String[] args) {
            Fan fan = new Fan();
            fan.setSpeed();
            fan.setOn();
            fan.setColor();
            fan.setRadius();
            int tocdo = fan.getSpeed();
            boolean battat = fan.getOn();
            String mau = fan.getColor();
            double radius = fan.getRadius();
            String result = fan.toSring();
            System.out.println(result);
    }
}
