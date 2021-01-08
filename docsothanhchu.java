import java.util.Scanner;
public class docsothanhchu {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        int a;
        System.out.println("nhập số");
        a = check.nextInt();
        if (a >= 0 && a < 10) {
            unit(a);
        } else if (a >= 10 && a < 20) {
            int b = a - 10;
            tows(b);
        } else if (a >= 20 && a < 100) {
            if (a > 20) {
                int c = a / 10;
                int d = a % 10;
                hundreds(c);
                unit(d);
            } else {
                int c = a / 10;
                hundreds(c);
            }
        } else if (a >= 100 && a < 1000) {
            int b = a % 100;
            int c = a / 100;
            if (b >= 0 && b < 10) {
                unit(c);
                System.out.print(" hundred and ");
                unit(b);
            } else if (b >= 10 && b < 20) {
                if (b > 10) {
                    unit(c);
                    System.out.print(" hundred and ");
                    tows(c);
                } else {
                    unit(c);
                    System.out.print(" hundred and ten");
                }
            } else if (b >= 20) {
                if (b > 20) {
                    if (b % 10 != 0) {
                        unit(c);
                        System.out.print(" hundred and ");
                        int e = b % 10;
                        int f = b / 10;
                        hundreds(f);
                        unit(e);
                    } else {
                        unit(c);
                        System.out.print(" hundred and ");
                        int e = b % 10;
                        int f = b / 10;
                        hundreds(f);
                        hundreds(e);
                    }
                } else {
                    unit(c);
                    System.out.print(" hundred and twenty");
                }
            }
        } else {
            System.out.println("đéo đọc được");
        }
    }
    static void unit(int num) {
        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
        }
    }
    static void tows(int num) {
        switch (num) {
            case 0:
                System.out.print(" ten");
                break;
            case 1:
                System.out.print(" eleven");
                break;
            case 2:
                System.out.print(" twelve");
                break;
            case 3:
                System.out.print(" thirteen");
                break;
            case 4:
                System.out.print(" fourteen");
                break;
            case 5:
                System.out.print(" fifteen");
                break;
            case 6:
                System.out.print(" sixteen");
                break;
            case 7:
                System.out.print(" seventeen");
                break;
            case 8:
                System.out.print(" eighteen");
                break;
            case 9:
                System.out.print(" nineteen");
                break;
        }
    }
    static void hundreds(int num) {
        switch (num) {
            case 2:
                System.out.print("twenty ");
                break;
            case 3:
                System.out.print("thirty ");
                break;
            case 4:
                System.out.print("forty ");
                break;
            case 5:
                System.out.print("fifty ");
                break;
            case 6:
                System.out.print("sixty ");
                break;
            case 7:
                System.out.print("seventy ");
                break;
            case 8:
                System.out.print("eighty ");
                break;
            case 9:
                System.out.print("ninety ");
                break;
        }
    }
}
