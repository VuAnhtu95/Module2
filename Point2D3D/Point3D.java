package Point2D3D;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(){}
    public Point3D(float x, float y , float z){
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        float[] arrNew = {getX(),getY(),getZ()};
        return arrNew;
    }
    @Override
    public String toString(){
        return "("
                +getX()
                +","
                +getY()
                +","
                +getZ()
                +")";
    }
}
