package Task3;
public class Rectangle {
    public double a;
    public double b;
    public double c;
    public double d;

    public Rectangle(double a, double b, double c, double d) {
        // Left
        this.a = a;
        // Right
        this.b = b;
        // Bottom
        this.c = c;
        // Top
        this.d = d;

    }

    public boolean isPointInsideRectangle(double x, double y) {
        return (x >= a) & (x <= b) & (y >=c) & (y<=d);
    }
}
