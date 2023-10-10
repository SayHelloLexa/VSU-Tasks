import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int num = 0; // проверяемое число
        for (int count = 0; count < n; ) {
            if (check(num)) {
                count++;
            }
            num++;
        }
        System.out.println(n + " " + (num - 1));
    }

    public static boolean check(long num) {
        while (num > 0) {
            long remains = num % 10;
            if (remains % 2 == 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}

    /*
    public static boolean check(long num) { // метод, в котором проверяется четность и нечетность цифр числа N
        long remains;
        boolean trueOrFalse = false;
        while (true) {
            remains = num % 10; // справа налево каждая цифра числа
            if (num == 0) {
                break;
            }
            if (remains % 2 == 0) {
                trueOrFalse = false;
            } else if (remains % 2 != 0) {
                trueOrFalse = true;
            }
            num = num / 10;
        }
        return trueOrFalse;
    }

     */



