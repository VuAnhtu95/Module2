package Array;

import java.util.Arrays;
import java.util.Scanner;

public class phantunhonhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        System.out.println("Nhập vào chiều dài của mảng ");
        size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + " của mảng : ");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        System.out.println(Arrays.toString(array));
        for (int j = 1; j < array.length; j++) {
            if (array[j]<min){
                min = array[j];
            }
        }
        System.out.println("phần tử nhỏ nhất là " +min);
    }
}
