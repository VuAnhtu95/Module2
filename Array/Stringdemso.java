package Array;

import java.util.Scanner;

public class Stringdemso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi : ");
        String abc = scanner.nextLine();
        System.out.println("Nhập ký tự muốn kiểm tra : ");
        String acb = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < abc.length(); i++) {
            String k = String.valueOf(abc.charAt(i));
            if (k.equals(acb)){
                count++;
            }
        }
        System.out.println("Số ký tự giống là " + count);
    }
}
