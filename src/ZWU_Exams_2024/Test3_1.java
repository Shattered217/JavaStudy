package ZWU_Exams_2024;

abstract class Student{
    String name,degree;
    int age;
    abstract void show();
}

class Undergradeate extends Student{
    String specialty;
    Undergradeate(String name,String degree,int age,String specialty){
        this.name=name;
        this.degree=degree;
        this.age=age;
        this.specialty=specialty;
    }
    void show() {
        System.out.println(name+degree+age+specialty);
    }
}

class Gradeate extends Student{
    String direction;
    Gradeate(String name,String degree,int age,String direction){
        this.name=name;
        this.degree=degree;
        this.age=age;
        this.direction=direction;
    }
    void show() {
        System.out.println(name+degree+age+direction);
    }
}

public class Test3_1 {
    public static void main(String[] args){
        Undergradeate a1 = new Undergradeate("张三","学士",20,"通信工程");
        Undergradeate a2 = new Undergradeate("张3","学1",21,"通信1");
        Gradeate b1 = new Gradeate("张5","硕士",25,"软件工程");
        Gradeate b2 = new Gradeate("张6","博士",20,"入机工程");
        a1.show();
        a2.show();
        b1.show();
        b2.show();
    }
}
