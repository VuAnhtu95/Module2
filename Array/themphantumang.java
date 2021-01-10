package Array;
import java.util.Arrays;
import java.util.Scanner;

public class themphantumang {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        int x = 0;
        int index = 0;
        System.out.println("Đây là mảng trước khi thêm ");
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào đây số cần thêm ");
        x = scanner.nextInt();
        System.out.println("Nhập vị trí mảng bạn muốn thêm ");
        index = scanner.nextInt();
        if (index <=1 && index >= (arr.length-1)){
            System.out.println("Không thêm được vào mảng ");
        } else {
            arr[index] = x;
        }
        System.out.println("Đây là mảng sau khi thêm ");
        System.out.println(Arrays.toString(arr));

    }
}
