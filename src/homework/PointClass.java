package homework;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.atan2;
import static java.lang.Math.toDegrees;

class Point {
    private double x;
    private double y;
    private static int pointCount = 0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        pointCount++;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point other) {
        return sqrt(pow((other.x - this.x), 2) + pow((other.y - this.y), 2));
    }

    public String getPolarCoordinates() {
        double r = sqrt(pow(x, 2) + pow(y, 2));
        double theta = toDegrees(atan2(y, x));
        return "极径: " + r + ", 角度: " + theta + "°";
    }

    public static int getPointCount() {
        return pointCount;
    }
}

public class PointClass {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(7, 1);
        System.out.println("p1 的坐标: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2 的坐标: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("p1 到 p2 的距离: " + p1.distance(p2));

        System.out.println("p1 的极坐标: " + p1.getPolarCoordinates());
        System.out.println("p2 的极坐标: " + p2.getPolarCoordinates());

        System.out.println("创建的 Point 对象个数: " + Point.getPointCount());
    }
}

