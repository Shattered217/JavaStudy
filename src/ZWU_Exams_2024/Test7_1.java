package ZWU_Exams_2024;
import  java.util.*;

class TicketWindow implements Runnable{
    private int tickets=50;
    Object lock = new Object();
    @Override
    public void run(){
        while(true){
            synchronized(lock) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                if(tickets>0) {
                    Thread th = Thread.currentThread();
                    String th_name = th.getName();
                    System.out.println(th_name + "正在发售第" + tickets-- + "张票");
                    Date date = new Date();
                    System.out.println(date);
                }else break;
            }
        }
    }
}

public class Test7_1 {
    public static void main(String[] args){
        TicketWindow tw = new TicketWindow();
        new Thread(tw,"窗口1").start();
        new Thread(tw,"窗口2").start();
        new Thread(tw,"窗口3").start();
        new Thread(tw,"窗口4").start();
        new Thread(tw,"窗口5").start();
        new Thread(tw,"窗口6").start();

    }
}
