package Array;
import java.util.Scanner;
import java.util.Arrays;
public class daonguocphantumang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Không được vượt quá 20");
        } while(size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mảng trước khi đổi là " + Arrays.toString(array));
        for(int a=0;a<array.length-1;a++){
            for(int b=a+1;b<array.length;b++){
                if(array[a] > array[b]){
                    int x = array[a];
                    array[a] = array[b];
                    array[b] = x;
                }
            }
        }
        System.out.println("Mảng sau khi đổi là " + Arrays.toString(array));
    }
}
