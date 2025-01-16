package ZWU_Exams_2024;

abstract class Graphics{
    String name;
    abstract void parameter();
    abstract void area();
}

class CfxGraphics extends Graphics{
    int x,y;
    public CfxGraphics(String name,int x,int y){
        this.name=name;
        this.x=x;
        this.y=y;
    }
    @Override
    public void parameter() {
        System.out.println(name+x+y);
    }

    @Override
    public void area() {
        int area = x*y;
        System.out.println(area);
    }
}

class YuanGraphics extends Graphics{
    double r;
    String colour;
    public YuanGraphics(String name,String colour,double r){
        this.name=name;
        this.colour=colour;
        this.r=r;
    }
    @Override
    public void parameter() {
        System.out.println(name+colour+r);
    }

    @Override
    public void area() {
        double area = 3.14*r*r;
        System.out.println(area);
    }
}

public class Test4_3 {
    public static void main(String[] args) {
        CfxGraphics a1 = new CfxGraphics("长方形", 3, 2);
        YuanGraphics a2 = new YuanGraphics("圆形", "红色", 4);

        a1.parameter();
        a1.area();
        a2.parameter();
        a2.area();
    }
}
