package Array;

import java.util.Scanner;
import java.util.Arrays;

public class demsosinhviendo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài :");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Độ dài không quá 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm của sinh viên " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh sách điểm của sinh viên : " );
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
            if (array[j] >= 5 && array[j] <= 10){
                count++;
            }
        }
        System.out.print("\n Số lượng sinh viên pass module là " + count);
    }
}
