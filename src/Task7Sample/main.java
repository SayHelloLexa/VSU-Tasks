package Task7Sample;

import java.util.Scanner;
import java.util.Locale;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите e: ");
        double e = scanner.nextDouble();

        function(n, x, e);
    }

    public static void function(int n, double x, double e) {
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double func = Math.sin(x) / x;
        double member = 1;
        double factorial = 1;

        for (int i = 0; Math.abs(member) > e / 10 || i < n || Math.abs(member) > e; i++){
            member = Math.pow(-1, i) * Math.pow(x * x, i) / factorial;
            factorial *= 2 * (i + 1) * (2 * (i + 1) + 1);

            if (Math.abs(member) > e) {
                sum2 += member;
            }

            if (Math.abs(member) > e / 10) {
                sum3 += member;
            }

            if (i < n) {
                sum1 += member;
            }
        }

        System.out.printf("Сумма %s слагаемых заданного вида: %.08f%n", n, sum1);
        System.out.printf("Сумма слагаемых, которые по абсолютной величине больше %s равна %.08f%n", e, sum2);
        System.out.printf("Сумма слагаемых, которые по абсолютной величине больше %s/10 равна %.08f%n", e, sum3);
        System.out.printf("Значение функции с помощью методов Math: %.08f%n", func);
    }
}