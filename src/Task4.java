import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int num = 0; // проверяемое число
        int count = 0; // счетчик чисел
        while (count < n) {
            if (check(num)) {
                count++;
            }
            num++;
        }
        System.out.println(n + " " + (num - 1));
    }


    public static boolean check(long num) { // метод, в котором проверяется четность и нечетность цифр числа N
        long b;
        boolean tf = false; // переменная, которая будет говорить о том, что подходит ли число N под условие
        while (true) {
            b = num % 10; // справа налево каждая цифра числа
            if (b == 0) {
                break;
            }
            if (b % 2 == 0) {
                tf = false;
            } else if (b % 2 != 0) {
                tf = true;
            }
            num = num / 10;

        }
        return tf;
    }

}

