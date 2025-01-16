package ZWU_Exams_2024;

import java.util.Scanner;

public class Test1_6 {
    public static void main(String[] args) {
        System.out.print("请输入外框的值: ");
        Scanner scanner_x = new Scanner(System.in);
        int x = scanner_x.nextInt();

        System.out.print("请输入内框的值: ");
        Scanner scanner_y = new Scanner(System.in);
        int y = scanner_y.nextInt();

        for(int i=0;i<x-y;i++){  //输出上边框
            for(int j=0;j<x;j++){
                System.out.print("*"); //正常输出长度个*
            }
            System.out.println();
        }
        for(int i=0;i<y;i++) { //输出中间
            for(int j=0;j<x-y;j++){
                System.out.print("*"); //输出左边的*
            }
            for (int j = 0; j < (2*y-x); j++) { //每行输出x-2(x-y)=2*y-x个空格
                System.out.print(" ");
            }
            for(int j=0;j<x-y;j++){   //输出右边的*
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=0;i<x-y;i++){  //输出下边框
            for(int j=0;j<x;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
