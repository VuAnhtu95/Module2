package Array;
import java.util.Arrays;
import java.util.Scanner;

public class timlonnhatmang2chieu {
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
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]>max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất là " + max);
    }
}
