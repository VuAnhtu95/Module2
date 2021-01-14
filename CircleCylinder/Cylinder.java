package CircleCylinder;

public class Cylinder extends Circle{
    private double width = 1.0;
    public Cylinder(){}
    public Cylinder(double radius, String color , double width){
        super(radius,color);
        this.width = width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public double getThetich(){
        return getArea()*width;
    }
    @Override
    public String toString(){
        return "hình trụ với chiều cao = "
                + getWidth()
                + " với bán kính là "
                + getRadius()
                + " với màu là "
                + getColor()
                + " với thể tích là "
                + getThetich()
                + " và nó là lớp con của lớp "
                + super.toString();
    }
}
