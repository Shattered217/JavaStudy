package classwork;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        try {
            System.out.println("请输入5个整数：");
            for (int i = 0; i < 5; i++) {
                String input = scanner.nextLine();

                try {
                    numbers[i] = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    throw new InvalidIntegerException("请输入整数");
                }
            }

            if (numbers.length != 5) {
                throw new InsufficientInputException("请输入5个整数");
            }

            System.out.println("您输入的整数是：");
            for (int num : numbers) {
                System.out.println(num);
            }

        } catch (InvalidIntegerException | InsufficientInputException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidIntegerException extends Exception {
    public InvalidIntegerException(String message) {
        super(message);
    }
}

class InsufficientInputException extends Exception {
    public InsufficientInputException(String message) {
        super(message);
    }
}

