import java.util.Scanner;

public class ungdungvehinh {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Vẽ hình tam giác");
            System.out.println("2. Vẽ hình chữ nhật");
            System.out.println("3. Vẽ hình vuông");
            System.out.println("0. Exit");
            System.out.println("Bạn muốn vẽ hình gì: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Tam giác");
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");
                    System.out.println("******");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }while (true);
    }
}
