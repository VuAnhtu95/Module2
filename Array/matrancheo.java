package Array;

import java.util.Arrays;
import java.util.Scanner;

public class matrancheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều ngang của mảng : ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào chiều dọc của mảng : ");
        int b = scanner.nextInt();
        int[][] array = new int[a][b];
        if (a == b){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print("Nhập phần tử " + (j) + " của mảng ngang thứ " + (i) + " của mảng 2 chiều: ");
                    array[i][j] = scanner.nextInt();
                }
            }
        } else if (a !=b){
            System.out.println("Không được");
            System.exit(1);
        }

        System.out.println(Arrays.deepToString(array));
        int counter = 0;
        int sum = 0;
        int total = 0;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j){
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng của đường chéo chính là " + sum);
    }
}
