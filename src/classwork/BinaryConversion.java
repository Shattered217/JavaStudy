package classwork;

import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");

        String input = scanner.nextLine();

        try {
            if (input.contains(".")) {
                throw new NumberFormatException("输入的是小数，请输入整数");
            }

            BigInteger bigInt = new BigInteger(input);

            System.out.println("该整数的二进制形式是：" + bigInt.toString(2));
        } catch (NumberFormatException e) {
            System.out.println("输入无效：" + e.getMessage());
        } catch (Exception e) {
            System.out.println("发生了未知错误：" + e.getMessage());
        }
    }
}
