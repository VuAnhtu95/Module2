package OOP.Fan;

import java.util.Scanner;

public class Fan {
    Scanner scanner = new Scanner(System.in);
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "pink";
    public Fan(){}
    public Fan(int speed , boolean on , double radius , String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public void setSpeed(){
        System.out.println("Nhập vào speed quạt bạn muốn : ");
        this.speed = scanner.nextInt();
        if (speed == MEDIUM){
            System.out.println("đây là tốc trung bình");
        }
        if (speed == FAST){
            System.out.println("đây là tốc nhanh ");
        }
    }
    public void setOn(){
        System.out.println("Bạn muốn bật hay tắt?");
        this.on = scanner.nextBoolean();
        if (on == true){
            System.out.println("đang bật");
        }else {
            System.out.println("đang tắt");
        }
    }
    public void setRadius(){
        System.out.println("bạn muốn quạt to như nào?");
        this.radius = scanner.nextDouble();
    }
    public void setColor(){
        System.out.println("Màu gì?");
        this.color = scanner.next();
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public String getColor(){
        return this.color;
    }
    public Double getRadius(){
        return this.radius;
    }
    public String toSring(){
        if (this.on == true){
            return "Quạt màu " + this.color + " đang bật và tốc độ của nó là " + this.speed + " bán kính là " +this.radius;
        }else {
            return "Quạt màu " + this.color + " đang tắt " + " bán kính là " +this.radius;
        }
    }
}
