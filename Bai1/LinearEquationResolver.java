import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        if (a != 0) {
            double solution = -b / a;
            System.out.printf("Kết quả là : %f!", solution);
        }
        else if (a == 0){
            if (b ==0){
                System.out.print("Phương trình vô số nghiệm!");
            }else {
                System.out.print("vô nghiệm");
            };
        };
    }
}
