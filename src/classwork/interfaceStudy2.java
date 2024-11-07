package classwork;

abstract class Student{
    public String name;
    public int age;
    public String degree;
    abstract void show();
}

class undergraduate extends Student{
    String specialty;
    public undergraduate(String name, int age, String degree, String specialty){
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.specialty = specialty;
    }
    public void show() {
            System.out.println("姓名：" + name + "，年龄：" + age + "，学位：" + degree + "，专业：" + specialty);
        }
}

class graduate extends Student{
    String research;
    public graduate(String name, int age, String degree, String research){
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.research = research;
    }
    public void show() {
            System.out.println("姓名：" + name + "，年龄：" + age + "，学位：" + degree + "，研究方向：" + research);
        }
}

public class interfaceStudy2 {
    public static void main(String[] args) {
        undergraduate stu1 = new undergraduate("张三", 20, "本科","通信");
        graduate stu2 = new graduate("王五", 25, "硕士","通信");
        stu1.show();
        stu2.show();
 }
}
