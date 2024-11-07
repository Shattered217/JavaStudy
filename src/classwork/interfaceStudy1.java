package classwork;

interface cicleInterface{
    public static final double PI = 3.14;
    public abstract void circleArea();
}

class cicleClass implements cicleInterface{
    double r=0;
    public cicleClass(double r){
        this.r = r;
    }
    @Override
    public void circleArea(){
        double area = PI * r * r;
        System.out.println("圆的面积：" + area);
    }
}

public class interfaceStudy1 {
    public static void main(String[] args) {
        cicleClass circ1 = new cicleClass(3.5);
        cicleClass circ2 = new cicleClass(5.0);
        circ1.circleArea();
        circ2.circleArea();
    }
}
