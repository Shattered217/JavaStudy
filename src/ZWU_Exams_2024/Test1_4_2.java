package ZWU_Exams_2024;

import java.util.Scanner;

public class Test1_4_2 {
    public static void main(String[] args) { //在1_4_1的基础上修改，也看做其对称图形

        System.out.print("请输入行数: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            for(int j=x-1;j>i;j--){
                System.out.print(" ");
            }
            for (double k = 0; k <=i; k=k+0.5) {
                System.out.print("*");
            }
            System.out.println();
        }
        //上面部分和1_4_1一致
        for (int i = x-2; i >=0; i--) { //下半部分，可以假设输入10行的情况
            for(int j=x-1;j>i;j--){     // 例如下半部分第一行，j=9，j>i，那么i必须为8，故i=x-2=8
                System.out.print(" ");
            }
            for (double k = 0; k <=i; k=k+0.5) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
