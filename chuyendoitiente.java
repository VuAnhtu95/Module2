import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền bạn cần đổi : ");
        double usd = scanner.nextDouble();
        double vnd = 23000 * usd;
        System.out.println("= "+ vnd + " đồng");
    }
}
