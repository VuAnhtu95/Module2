package LOOP;
import java.util.Scanner;
public class hienthicacloaihinh {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Menu");
            System.out.println("1: Vẽ hình chữ nhật");
            System.out.println("2: Vẽ hình tam giác");
            System.out.println("3: Vẽ hình vuông");
            System.out.println("4: Vẽ hình tam giác đều");
            System.out.println("Bạn muốn vẽ hình gì?");
            choice = scanner.nextInt();
            switch (choice){
                case 3 ->{
                    for (int i=0;i<=4;i++){
                        for (int j=0;j<=6;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    };
                }
                case 1 ->{
                    for (int i=0;i<=4;i++){
                        for (int j=0;j<=10;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                case 2 ->{
                    for(int i=1; i<=5; i++){
                        for(int j=1; j<=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                case 4 ->{
                    for(int i=1; i<=5; i++){
                        for(int j=5; j>=i; j--){
                            System.out.print(" ");
                        }
                        for(int j=1; j<=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
            }
        }while (true);
    }
}
