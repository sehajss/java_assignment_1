class Point {
    int x, y;
    Point(int x, int y) { this.x = x; this.y = y; }
    Point(Point p) { this.x = p.x; this.y = p.y; }
}
public class CopyCons {
    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        Point p2 = new Point(p1);
        System.out.println(p2.x + "," + p2.y);
    }
}
