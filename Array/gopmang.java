package Array;

import java.util.Scanner;
import java.util.Arrays;
public class gopmang {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + " của mảng 1 : ");
            array1[i] = scanner.nextInt();
        }
        int[] array2 = new int[10];
        for (int j = 0; j < 10; j++) {
            System.out.print("Nhập phần tử " + (j + 1) + " của mảng 2 : ");
            array2[j] = scanner.nextInt();
        }
        System.out.println("Đây là mảng 1 : "+Arrays.toString(array1));
        System.out.println("Đây là mảng 2 : "+Arrays.toString(array2));
        int[] array3 = new int[array1.length+array2.length];
        for (int a = 0; a < array1.length; a++) {
            array3[a] = array1[a];
        }
        int next = array1.length;
        for (int i = 0; i < array2.length; i++) {
            array3[next+i]=array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}
