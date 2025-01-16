package ZWU_Exams_2024;

import java.util.Scanner;

public class Test1_3_3 {
    public static void main(String[] args) {

        System.out.print("请输入奇数行数: ");
        Scanner scanner = new Scanner(System.in); //监听键盘输入
        int x = scanner.nextInt(); //将输入的值赋给x

        for (int i = 0; i < (x-1)/2; i++) { //一共x行,可将中间的一行看成对称线，上下对称来做
            for (int k = 0; k <=i; k++) { //第一行有一个*，每行累加1，故控制*输出的循环次数为i
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<(x+1)/2;i++) { //中间一行
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < (x-1)/2; i++) { //一共(x-1)/2行
            for(int j=0;j<=i;j++){ //第一行为1个空格，每行累加1，故控制空格输出的循环次数为i
                System.out.print(" ");
            }
            for (int k = (x-1)/2-i; k >0 ; k--) { //第一行有(x-1)/2-1个*，每行累减1，故控制*输出的循环次数为(x-1)/2-i
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
