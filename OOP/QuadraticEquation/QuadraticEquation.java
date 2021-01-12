package OOP.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public double delta;
    public double R1;
    public double R2;
    public QuadraticEquation(double a , double b , double c , double delta){
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = 0d;
    }
    public double geta() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC(){
        return c;
    }
    Scanner scanner = new Scanner(System.in);
    public void setA(){
        System.out.println("Nhập vào số a : ");
        this.a = scanner.nextDouble();
    }
    public void setB(){
        System.out.println("Nhập vào số b : ");
        this.b = scanner.nextDouble();
    }
    public void setC(){
        System.out.println("Nhập vào số c : ");
        this.c = scanner.nextDouble();
    }
    public double getDiscriminant(){
        this.delta = (this.b*this.b) - (4*this.a*this.c);
        return this.delta;
    }
    public double  getRoot1(){
        if (this.delta >=0){
            this.R1 = (-(this.b) + Math.sqrt(this.delta))/(2*this.a);
            return this.R1;
        }else {
            return 0;
        }
    }
    public double  getRoot2(){
        if (this.delta >=0){
            this.R2 = (-(this.b) - Math.sqrt(this.delta))/(2*this.a);
            return this.R2;
        }else {
            return 0;
        }
    }
}
