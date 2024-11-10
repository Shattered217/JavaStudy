package homework;

import static java.lang.Math.pow;

class Circle1{
    double pointa,pointb,pointc,pointd;
    public Circle1(double pointa, double pointb, double pointc, double pointd) {
        this.pointa = pointa;
        this.pointb = pointb;
        this.pointc = pointc;
        this.pointd = pointd;
    }
    public void CircleArea() {
        double area = 3.14 *((pointc-pointa)*(pointc-pointa) +(pointd-pointb)*(pointd-pointb));
        System.out.println("圆的面积：" + area);
    }
}

public class CircleClass {
    public static void main(String args[]) {
    Circle1 a1=new Circle1(0,0,8.5,9);
    Circle1 a2=new Circle1(2,3.5,9,6);
    a1.CircleArea();
    a2.CircleArea();
    }
}
