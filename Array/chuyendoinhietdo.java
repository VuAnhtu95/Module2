package Array;
import java.util.Scanner;

public class chuyendoinhietdo {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit sang Celsius");
            System.out.println("2. Celsius sang Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Bạn muốn gì? ");
            choice = input.nextInt();
            switch (choice) {
                case 1 ->{
                    System.out.println("Nhập vào fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit sang Celsius: " + fahrenheitToCelsius(fahrenheit));
                }
                case 0 ->{
                    System.exit(0);
                }
                case 2 ->{
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                }
                default -> {
                    System.out.println("Không có lựa chọn này");
                }
            }
        } while (true);
    }
}
