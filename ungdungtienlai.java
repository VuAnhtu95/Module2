import java.util.Scanner;

public class ungdungtienlai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 7.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tiền gửi của bạn : ");
        money = scanner.nextDouble();
        System.out.println("Bạn gửi mấy tháng ?");
        month = scanner.nextInt();
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset += money * (interset_rate/100)/12 * month;
        }
        System.out.println("Lãi của bạn là " + total_interset);
    }
}
