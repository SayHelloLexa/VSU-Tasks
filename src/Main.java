public class Main {

    public static void main(String[] args) {
        int s = 7;
        if (s % 2 == 0) {
            System.out.println("Некорректные параметры фигуры");
            return;
        }
        drawTop(s);
        drawMiddle(s);
        drawBottom(s);
    }

    public static void drawTop(int s) {
        for (int i = 0; i < s / 2; i++) {
            printSymbolNTimes(' ', i);
            System.out.print("*");
            printSymbolNTimes(' ', s / 2 - i - 1);
            System.out.print("*");
            printSymbolNTimes(' ', s / 2 - i - 1);
            System.out.print("*");
            System.out.println();

        }
    }

    public static void drawMiddle(int s) {
        printSymbolNTimes('*', s / 2);
        printSymbolNTimes('*', s / 4);
        printSymbolNTimes('*', s / 2);
        System.out.println();
    }

    public static void drawBottom(int s) {
        for (int i = s / 2 - 1; i >= 0; i--) {
            printSymbolNTimes(' ', i);
            System.out.print("*");
            printSymbolNTimes(' ', s / 2 - i - 1);
            System.out.print("*");
            printSymbolNTimes(' ', s / 2 - i - 1);
            System.out.print("*");
            System.out.println();
        }
    }

    public static void printSymbolNTimes(char symbol, int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(symbol);
        }
    }
}