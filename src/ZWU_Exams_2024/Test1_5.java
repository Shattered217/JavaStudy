package ZWU_Exams_2024;

import java.util.Scanner;

public class Test1_5 {
    public static void main(String[] args) {
        System.out.print("请输入长度: ");
        Scanner scanner_x = new Scanner(System.in);
        int x = scanner_x.nextInt();

        System.out.print("请输入宽度: ");
        Scanner scanner_y = new Scanner(System.in);
        int y = scanner_y.nextInt();

        for(int i=0;i<x;i++){
            System.out.print("*"); //正常输出长度个*
        }
        System.out.println();
        for(int i=0;i<y-2;i++) { //输出y-2行
            System.out.print("*");
            for (int j = 0; j < x - 2; j++) { //每行输出x-2个空格
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=0;i<x;i++) {
            System.out.print("*");
        }
    }
}
