import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите количество слагаемых n: ");
        int n = scanner.nextInt();

        System.out.print("Введите значение e: ");
        double e = scanner.nextDouble();

        double sum = 0;
        double term = 1;
        int sign = 1;

        for (int i = 0; i < n; i++) {
            sum += term;

            if (Math.abs(term) > e) {
                // Вычисляем сумму слагаемых, абсолютное значение которых больше e
                // и сумму слагаемых, абсолютное значение которых больше e/10
                // эти значения будут использованы в выводе после окончания цикла
            }

            // Находим следующий член ряда
            term *= (-1) * x * x / ((i + 1) * (i + 2));
            sign *= -1;
        }

        double termMoreE = sum - term;  // Сумма слагаемых с абсолютным значением > e
        double termMoreEOver10 = sum - term;  // Сумма слагаемых с абсолютным значением > e/10

        System.out.println("Сумма n слагаемых: " + sum);
        System.out.println("Сумма слагаемых > e: " + termMoreE);
        System.out.println("Сумма слагаемых > e/10: " + termMoreEOver10);

        // Вычисление значения функции с помощью Math
        double functionValue = Math.exp(-x * x);
        System.out.println("Значение функции с помощью Math: " + functionValue);
    }
}


