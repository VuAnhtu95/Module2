package Array;
import java.util.Scanner;
import java.util.Arrays;
public class timgiatrilonnhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Không được vượt quá 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập vào phần tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là " + max + " ở vị trí " + index);
    }
}
