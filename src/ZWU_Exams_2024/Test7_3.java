package ZWU_Exams_2024;
import java.text.SimpleDateFormat;
import  java.util.*;

class HospitalTickets implements Runnable {
    int tickests = 0;
    Object ob = new Object();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Date date = new Date(System.currentTimeMillis());

    static String preTime(int i) {
        int h = 0, m = 0;
        if (i < 24) {
            h = 8 + (i / 6);
        } else {
            h = 10 + (i / 6);
        }
        m = (i % 6) * 10;
        return new String(h + ":" + m);
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            synchronized (ob) {
                if (tickests < 50) {
                    System.out.println(Thread.currentThread().getName() + "预约：" + tickests + "号，下单时间：" + formatter.format(date)
                            + "预约时间" + preTime(tickests));
                    tickests++;
                } else {
                    System.out.println("所有专家号已经预约完！");
                    break;
                }
            }
        }
    }

}

public class Test7_3 {
    public static void main(String[] args) {
        HospitalTickets ht=new HospitalTickets();
        for (int i = 1; i <5; i++) {
            new Thread(ht,"机器编号："+i).start();
        }
    }
}
