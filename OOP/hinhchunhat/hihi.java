package OOP.hinhchunhat;

import java.util.Scanner;

public class hihi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        lophinhchunhat rectangle = new lophinhchunhat(width, height);
        System.out.println("Your hình chữ nhật \n " + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}
