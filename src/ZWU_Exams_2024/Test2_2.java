package ZWU_Exams_2024;

class CircleClass{
    double circle_x, circle_y;
    public CircleClass(double circle_x, double circle_y){
        this.circle_x = circle_x;
        this.circle_y = circle_y;
    }
}

class CircleArea {
    final static double PI=Math.PI;
    public static double Area(CircleClass a, CircleClass b) {
        double r2 = (a.circle_x - b.circle_x) * (a.circle_x - b.circle_x) + (a.circle_y - b.circle_y) * (a.circle_y - b.circle_y);
        return PI * r2;
    }
}

public class Test2_2 {
    public static void main(String[] args) {
        CircleClass point1 = new CircleClass(8.5,9);
        CircleClass point2 = new CircleClass(0,0);

        CircleClass point3 = new CircleClass(9,6);
        CircleClass point4 = new CircleClass(2,3.5);

        double area1 = CircleArea.Area(point1, point2);
        double area2 = CircleArea.Area(point3, point4);

        System.out.println("圆1的面积为：" + area1);
        System.out.println("圆2的面积为：" + area2);
    }

}












