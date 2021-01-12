package OOP.QuadraticEquation;

public class hoho {
    public static void main(String[] args) {
        QuadraticEquation bachai = new QuadraticEquation(1.2,1.2,1.2,1.2);
        bachai.setA();
        bachai.setB();
        bachai.setC();
        double soa = bachai.geta();
        double sob = bachai.getB();
        double soc = bachai.getC();
        double dl = bachai.getDiscriminant();
        double result = bachai.getRoot1();
        double result2 = bachai.getRoot2();
        System.out.println(result);
        System.out.println(result2);
    }
}
