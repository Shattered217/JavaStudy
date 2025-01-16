package ZWU_Exams_2024;

interface Shape{
    double area(double a);
}

class Square implements Shape{
    double a;
    public double area(double a){
        this.a=a;
        double area=a*a;
        return area;
    }
}

class Circle implements Shape{
    double r;
    public double area(double r){
        this.r=r;
        double area=r*r*3.14;
        return area;
    }
}

public class Test4_4 {
    public static void main(String[] args){
        double area1,area2;

        Square a1 = new Square();
        Circle a2 = new Circle();

        area1=a1.area(2);
        area2=a2.area(3);

        System.out.println(area1);
        System.out.println(area2);
    }
}
