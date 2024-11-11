package homework;

abstract class Graphics{
    public String name;
    public int x,y;
    abstract public String parameter();
    abstract public double area();
}

class Rectangle extends Graphics {
    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String parameter() {
        return "矩形的长：" + x + " 宽：" + y;
    }

    public double area() {
        return x * y;
    }
}

class Circle extends Graphics {
    public String color;

    public Circle(int x, String color) {
        this.x = x;
        this.color = color;
    }

    public String parameter() {
        return "圆的半径：" + x + " 颜色：" + color;
    }

    public double area() {
        return Math.PI * x * x;
    }
}

public class GraphicsClass {
    public static void main(String[] args) {
        Rectangle a1 = new Rectangle(3, 2);
        Circle a2 = new Circle(5, "红");
        System.out.println(a1.parameter());
        System.out.println("矩形的面积：" + a1.area());
        System.out.println(a2.parameter());
        System.out.println("圆的面积：" + a2.area());
    }
}