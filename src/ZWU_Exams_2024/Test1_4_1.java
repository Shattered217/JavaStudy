package ZWU_Exams_2024;

import java.util.Scanner;

public class Test1_4_1 {
    public static void main(String[] args) { //可看做1_3_1的对称图形，故只要在*的输出上稍作修改即可

        System.out.print("请输入行数: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            for(int j=x-1;j>i;j--){
                System.out.print(" ");
            }                                    //上面部分和1_3_1一致
            for (double k = 0; k <=i; k=k+0.5) { //只要让k每次只增加0.5，相当于比原来的会多加一次，实现效果
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
