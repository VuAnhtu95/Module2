import java.util.Scanner;
public class tinhsongaytrongthang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tháng bạn muốn tìm?");
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng bạn nhập có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng bạn nhập có 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng bạn vừa nhập có 30 ngày");
                break;
        };
    }
}
