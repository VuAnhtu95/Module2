package Point2D3D;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D(){
    }
    public Point2D(float x , float y){
        this.x = x;
        this.y = y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getX() {
        return x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getY() {
        return y;
    }
    public float[] getXY() {
      float[] arr = {this.x,this.y};
      return arr;
    }
    @Override
    public String toString(){
        return "("
                + getX()
                +","
                + getY()
                +")";
    }
}
