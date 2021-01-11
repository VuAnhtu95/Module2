package Array;

import java.util.Arrays;
import java.util.Scanner;

public class sumcot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều ngang của mảng : ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào chiều dọc của mảng : ");
        int b = scanner.nextInt();
        int[][] array = new int[a][b];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Nhập phần tử " + (j) + " của mảng ngang thứ " + (i) + " của mảng 2 chiều: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        int counter = 0;
        for (int i = 0; i < b; i++) {
            int sum = 0;
            for (int j = 0; j < a; j++) {
                sum += array[j][i];
            }
            System.out.println("Tổng của cột số " + i + " là " + sum);
        }
    }
}