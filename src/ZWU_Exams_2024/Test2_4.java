package ZWU_Exams_2024;

class Point{
    final static double PI = 3.14;
    static int count=0;
    int x,y;
    public void get_Point(){
        this.x = x;
        this.y = y;
        System.out.println("("+this.x+","+this.y+")");
    }
    public void set_Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public double angle(){
        return (180/PI)*Math.atan2(y,x);
    }
    public double radius(){
        return Math.sqrt(x*x+y*y);
    }
    public double distance(Point a){
        double r;
        r=Math.sqrt((x-a.x)*(x-a.x)+(y-a.y)*(y-a.y));
        return r;
    }

    static void set_count(){
        count++;
    }
    static int get_count(){
        return count;
    }
}

public class Test2_4 {
    public static void main(String[] args){
        Point a = new Point();
        a.set_Point(2,2);
        a.set_count();
        a.get_count();
        a.get_Point();
        System.out.println("计数："+a.get_count());
        Point b = new Point();
        b.set_Point(4,4);
        b.set_count();
        b.get_count();
        b.get_Point();
        System.out.println("计数："+b.get_count());
        System.out.println("距离："+a.distance(b));
        System.out.println("极坐标角度："+b.angle()+" 极坐标r："+b.radius());
    }
}
