package homework;

interface Shape{
    public double area(double x);
}

class SquareShape implements Shape {
    public double area(double x){
        return x * x;
    }
}

class CircleShape implements Shape {
    public double area(double x) {
        return Math.PI * x * x;
    }
}


public class ShapeClass {
    public static void main(String args[]){
        SquareShape a1 = new SquareShape();
        CircleShape a2 = new CircleShape();
        System.out.println("正方形的面积：" + a1.area(2));
        System.out.println("圆的面积：" + a2.area(3));
    }
}
