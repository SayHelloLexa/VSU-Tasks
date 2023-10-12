package Task3;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static final Line L = new Line(-2, 2, -4);
    public static final HorizontalParabola1 P1 = new HorizontalParabola1(-1, 5, 1);
    public static final HorizontalParabola2 P2 = new HorizontalParabola2(-2, -5, -1);
    public static final VerticalParabola P3 = new VerticalParabola(5, 4, -0.25);
    public static final Rectangle R = new Rectangle(-5, -2, 0, 9);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X: ");
        double x = scanner.nextDouble();
        System.out.print("Enter Y: ");
        double y = scanner.nextDouble();
        System.out.println(getColor(x, y));

        System.out.println("\nTests:");
        System.out.println(getColor(-1, 8));
        System.out.println(getColor(-3, 10.5));
        System.out.println(getColor(-1.3, 7.9));
        System.out.println(getColor(-7, 1));
        System.out.println(getColor(-3.9, 1));
        System.out.println(getColor(-3.9, 0.4));
        System.out.println(getColor(-6, -2));
        System.out.println(getColor(5, 5));
        System.out.println(getColor(0, 6));
        System.out.println(getColor(4.5, -3));
        System.out.println(getColor(-1, 3));
        System.out.println(getColor(-3, 1.5));
        System.out.println(getColor(-3, 0));
        System.out.println(getColor(2, -3));
    }

    // P1 - Белая
    // P3 - Зеленая нижняя
    // P2 -
    // R - прямоугольник
    public static SimpleColor getColor(double x, double y) {
        if (P2.isPointLeftOfParabola2(x,y)){
            return SimpleColor.GREEN;
        }
        if (R.isPointInsideRectangle(x,y)){
            return SimpleColor.GRAY;
        }
        if (L.isPointBelowLine(x,y) && y > 0){
            return SimpleColor.YELLOW;
        }
        if (P1.isPointRightOfParabola1(x,y)){
            return SimpleColor.WHITE;
        }
        if (P3.isPointDownOfParabola(x,y) && L.isPointBelowLine(x,y)){
            return SimpleColor.GREEN;
        }

        return SimpleColor.BLUE;
    }
}












