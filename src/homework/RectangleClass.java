package homework;

class Rectangle1{
    double pointa,pointb,pointc,pointd;
    public Rectangle1(double pointa, double pointb, double pointc, double pointd) {
        this.pointa = pointa;
        this.pointb = pointb;
        this.pointc = pointc;
        this.pointd = pointd;
    }
    public void RectangleArea() {
        double area = (pointc-pointa)*(pointd-pointb);
        System.out.println("矩形的面积：" + area);
    }
}

public class RectangleClass {
    public static void main(String[] args) {
        Rectangle1 a1=new Rectangle1(0,0,8.5,9);
        Rectangle1 a2=new Rectangle1(2,3.5,9,6);
        a1.RectangleArea();
        a2.RectangleArea();
    }
}
