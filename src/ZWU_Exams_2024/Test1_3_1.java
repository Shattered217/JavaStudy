package ZWU_Exams_2024;

import java.util.Scanner;

public class Test1_3_1 {
    public static void main(String[] args) {

        System.out.print("请输入行数: ");
        Scanner scanner = new Scanner(System.in); //监听键盘输入
        int x = scanner.nextInt(); //将输入的值赋给x

        for (int i = 0; i < x; i++) { //一共x行，最外部循环x次，下面的表示每行的内容
            for(int j=x-1;j>i;j--){ //第一行为x-1个空格，每行累减1，故控制空格输出的循环次数为x-i
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) { //第一行有一个*，每行累加1，故控制*输出的循环次数为i
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
