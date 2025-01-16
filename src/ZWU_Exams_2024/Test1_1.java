//角谷猜想：任何一个正整数n，如果它是偶数则除以2，如果是奇数则乘3加1，这样得到一个新的整数，如此继续进行上述处理，则最后得到的数一定是1。编写应用程序证明：在3~10000之间的所有正整数都符合上述规则。
package ZWU_Exams_2024;

public class Test1_1 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 3; i <= 10000; i++) {
            int n = i;
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = n * 3 + 1;
                }
            }
            a++;
            System.out.println(i+"符合角谷猜想");
        }
        System.out.println("3-10000中共有"+a+"个数字符合");
    }
}