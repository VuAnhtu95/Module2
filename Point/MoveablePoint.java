package Point;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    private float[] speed = new float[1];
    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){}
    public MoveablePoint(float x , float y , float xSpeed , float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        speed[0] = this.xSpeed;
        speed[1] = this.ySpeed;
    }
    public float[] getSpeed(){
        return speed;
    }
    public MoveablePoint move(){
        setX(getxSpeed()+1);
        setY(getySpeed()+1);
        return this;
    }
}
