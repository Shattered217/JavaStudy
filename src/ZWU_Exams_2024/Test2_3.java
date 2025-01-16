package ZWU_Exams_2024;

class RectangleClass{
    double x1,y1,x2,y2;
    public RectangleClass(double x1,double y1,double x2,double y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    public double get_area(){
        double area=(x2 - x1)*(y2 - y1);
        return area;
    }
}

public class Test2_3 {
    public static void main(String[] args){
        RectangleClass a1 = new RectangleClass(1,1,4,5);
        RectangleClass a2 = new RectangleClass(7,6,10,16);
        System.out.println("长方形1的面积是"+a1.get_area());
        System.out.println("长方形2的面积是"+a2.get_area());
    }
}
