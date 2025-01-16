package ZWU_Exams_2024;

interface CircleInterface{
    final static double PI=3.14;
    abstract void circleArea1();
}

class CircleClass1 implements CircleInterface{
    double r;
    double area;
    public CircleClass1(double r){
        this.r=r;
    }
    public void circleArea1(){
        area=r*r*PI;
    }
    public void getArea1(){
        System.out.println(area);
    }
}

public class Test4_2 {
    public static void main(String[] args){
        CircleClass1 a1 = new CircleClass1(3.5);
        CircleClass1 a2 = new CircleClass1(5.0);
        a1.circleArea1();
        a2.circleArea1();
        a1.getArea1();
        a2.getArea1();
    }
}
