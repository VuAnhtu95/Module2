package LOOP;
import java.util.Scanner;
public class songuyentonhohon100 {
    static boolean isPrime(int number) {
        if (number == 2)
            return true;
        else if (number % 2 == 0 || number == 1)
            return false;
        else {
            for (int i = 3; i < Math.sqrt(number); i += 2) {
                if (number % i == 0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        int N=0;
        boolean isPrimee;
        for (;N<100;N++){
            isPrimee = isPrime(N);
            if (isPrimee)
            System.out.print(N + " ");
        }
    }
}
