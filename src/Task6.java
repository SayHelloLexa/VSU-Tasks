import java.util.Locale;
import java.util.Scanner;



public class Task6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        System.out.print("Введите e: ");
        double e = scanner.nextDouble();

        calculateAndPrint(n, x, e);
    }

    public static void calculateAndPrint(int n, double x, double e) {
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;

        double func = Math.sin(x) / x;
        double an = 1;
        double factorial = 1;

        for (int i = 0; Math.abs(an) > e / 10 || i < n || Math.abs(an) > e; i++){
            an = Math.pow(-1, i) * Math.pow(x * x, i) / factorial;
            factorial *= 2 * (i + 1) * (2 * (i + 1) + 1);

            if (Math.abs(an) > e) {
                sum2 += an;
            }

            if (Math.abs(an) > e / 10) {
                sum3 += an;
            }

            if (i < n) {
                sum1 += an;
            }
        }

        System.out.printf("Сумма %s слагаемых заданного вида: %.08f%n", n, sum1);
        System.out.printf("Сумма слагаемых, которые по абсолютной величине больше %s равна %.08f%n", e, sum2);
        System.out.printf("Сумма слагаемых, которые по абсолютной величине больше %s/10 равна %.08f%n", e, sum3);
        System.out.printf("Значение функции с помощью методов Math: %.08f%n", func);
    }
}












