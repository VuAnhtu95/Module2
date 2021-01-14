package CircleCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";
    public Circle(){}
    public Circle(double radius, String color){
        this.color = color;
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor( String color){
        this.color = color;
    }
    public double getArea(){
        return (Math.pow(this.radius,2))*2;
    }
    @Override
    public String toString(){
        return "hình tròn với bán kính = "
                + getRadius()
                + " và màu của nó là "
                + getColor();
    }
}
