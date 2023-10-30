import java.util.Scanner;

public class prints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите количество слагаемых n: ");
        int n = scanner.nextInt();

        System.out.print("Введите значение e: ");
        double e = scanner.nextDouble();

        double sumAll = 0;
        double sumGreaterE = 0;
        double sumGreaterE10 = 0;
        double functionValue = Math.sin(x) / x;

        if (Double.isNaN(functionValue)) {
            System.out.println("Невозможно вычислить функцию для заданных значений x.");
            return;
        }

        double currentTerm = functionValue;
        double absCurrentTerm = Math.abs(currentTerm);

        for (int i = 1; i <= n; i++) {
            sumAll += currentTerm;

            if (absCurrentTerm > e) {
                sumGreaterE += currentTerm;
            }

            if (absCurrentTerm > e / 10) {
                sumGreaterE10 += currentTerm;
            }

            currentTerm = -currentTerm * (x * x) / ((2 * i + 1) * (2 * i));
            absCurrentTerm = Math.abs(currentTerm);
        }

        System.out.println("Сумма всех слагаемых: " + sumAll);
        System.out.println("Сумма слагаемых, больших по абсолютной величине, чем " + e + ": " + sumGreaterE);
        System.out.println("Сумма слагаемых, больших по абсолютной величине, чем " + e / 10 + ": " + sumGreaterE10);
        System.out.println("Значение функции sin(x)/x: " + functionValue);
    }
}
