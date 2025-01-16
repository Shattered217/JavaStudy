package ZWU_Exams_2024;

class Bank{
    private int money=0;
    public void add(){
        money+=500;
    }
    public String toString(){
        return "余额："+money+"元";
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money){
       this.money=money;
    }
}

class user implements Runnable {
    Bank bank = new Bank();
    @Override
    public void run() {
        int num = 0;
        while (num < 4) {
            num++;
            synchronized (this) {
                bank.add();
                System.out.println(Thread.currentThread().getName() + "正在" + (num) + "次存500元" + bank.toString());
            }
        }
    }
}

public class Test7_2 {
    public static void main(String[] args){
        user user = new user();
        new Thread(user,"用户A").start();
        new Thread(user,"用户B").start();
        new Thread(user,"用户C").start();
    }
}
