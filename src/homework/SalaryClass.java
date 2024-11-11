package homework;

class Salary{
    public String name;
    public String vocation;
    public int salary;
    public Salary(String name, String vocation, int salary) {
        this.name = name;
        this.vocation = vocation;
        this.salary = salary;
    }
    public void show(){
        System.out.println("姓名："+name+" 职业："+vocation+" 工资："+salary+"元/月");
    }
}

class Salary1 extends Salary{
    public int lessonSalary;
    public Salary1(String name, String vocation, int salary, int lessonSalary) {
        super(name, vocation, salary);
        this.lessonSalary = lessonSalary;
    }
    public void show() {
        System.out.println("姓名：" + name + " 职业：" + vocation + " 工资：" + salary + " 课结工资：" + lessonSalary+"元/课");
    }
}

class Salary2 extends Salary{
    public int workSalary;
    public Salary2(String name, String vocation, int salary, int workSalary) {
        super(name, vocation, salary);
        this.workSalary = workSalary;
    }
    public void show() {
        System.out.println("姓名：" + name + " 职业：" + vocation + " 工资：" + salary + " 科研激励奖：" + workSalary+"元/季度");
    }
}

public class SalaryClass {
    public static void main(String args[]){
        Salary a1=new Salary("张三","工人",4000);
        Salary a2=new Salary("李四","服务员",3500);
        Salary1 a3=new Salary1("王五","教师",5000,200);
        Salary2 a4=new Salary2("赵六","科研人员",7000,20000);
        a1.show();
        a2.show();
        a3.show();
        a4.show();
    }
}
