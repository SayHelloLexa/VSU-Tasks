import java.util.Locale;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите количество слагаемых n: ");
        int n = scanner.nextInt();
        System.out.print("Введите значение e: ");
        double e = scanner.nextDouble();
        double sum = 0.0; // Вычисление суммы n слагаемых
        double a = 1.0;  // Первое слагаемое
        for (int i = 0; i < n; i++) {
            sum += a;
            a *= -(x * x) / ((2 * i + 2) * (2 * i + 3));

            // Вывод суммы n слагаемых
            System.out.println("Сумма " + n + " слагаемых: " + sum);

            double sumGreaterE = 0.0; // Вычисление суммы слагаемых, по модулю больших, чем e
            a = 1.0;
            if (Math.abs(a) > e) {
                sumGreaterE += a;
                a *= -(x * x) / ((2 * n + 2) * (2 * n + 3));
                n++;
            }
            System.out.println("Сумма слагаемых, модуль которых больше " + e + ": " + sumGreaterE);
            double sumGreaterEOver10 = 0.0;
            a = 1.0;
            n = 0;

            if (Math.abs(a) > e / 10) {
                sumGreaterEOver10 += a;
                a *= -(x * x) / ((2 * n + 2) * (2 * n + 3));
                n++;
            }
            System.out.println("Сумма слагаемых, модуль которых больше " + e / 10 + ": " + sumGreaterEOver10);
            double mathValue = Math.sin(x) / x;
            System.out.println("Значение функции с помощью Math: " + mathValue);
        }
    }
}







