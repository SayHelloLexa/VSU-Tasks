
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int s = scanner.nextInt();

        rectangle(w, h, s);
    }

    //int between =
    public static void rectangle(int w, int h, int s) {
        int count = 0;
        for (int r = 0; r < h; r++) {  // r - row
            if (r == 0 || r == h - 1) {
                // первая или последняя строка
                System.out.print("+");
                for (int c = 1; c < w - 1; c++) {  // c - column
                    System.out.print("-");
                }
                System.out.println("+");
            } else {
                // "средние" строки
                System.out.print("|");
                for (int i = 1; i < (w - 2 * s); i ++){
                    count ++;
                    char star = '*';
                    if (count == s + 1) {
                        System.out.print("  ");
                        count = 0;
                    }else System.out.print(star);
                }
                for (int c = 1; c < s; c++) {  // c - column
                    char ch = ' ';
                    System.out.print(ch);
                }
                System.out.println("|");
            }
        }
    }
}




