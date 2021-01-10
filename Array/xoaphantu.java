package Array;
import java.util.Arrays;
import java.util.Scanner;

public class xoaphantu {
    public static void main(String[] args) {
        int []arr = {4,12,7,8,6,2,6};
        int x;
        System.out.println("Đây là mảng trước khi xóa");
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào đây số cần xóa");
        x = scanner.nextInt();
        int index_del = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == x){
                index_del = i;
                arr[i] = arr[index_del+1];
                break;
            }
        }
        System.out.println("Đây là mảng sau khi xóa "+Arrays.toString(arr));
    }
}
