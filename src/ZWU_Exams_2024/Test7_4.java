package ZWU_Exams_2024;

class Account{
    private int money=0;
    public void add(){
        money+=200;
    }
    public String back(){
        return "存款200元，余额"+money+"元";
    }
}

class Fumu implements Runnable{
    Account account = new Account();
    public void run(){
        int num=0;
        while (num<4){
            num++;
            synchronized(this){
                account.add();
                System.out.println(Thread.currentThread().getName()+account.back());
            }
        }
    }
}

public class Test7_4 {
    public static void main(String[] args){
        Fumu fumu = new Fumu();
        new Thread(fumu,"爸爸").start();
        new Thread(fumu,"妈妈").start();
    }
}
