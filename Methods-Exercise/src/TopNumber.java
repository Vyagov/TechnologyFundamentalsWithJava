import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        int len = Integer.parseInt(number);

        for (int num = 1; num <= len; num++) {
            if (isDivisibleBy8(num) && isLeast1OddDigit(num)) {
                System.out.println(num);
            }
        }
    }

    static boolean isDivisibleBy8(int num) {
        if (sumOfDigits(num) % 8 == 0) {
            return true;
        }
        return false;
    }

    static boolean isLeast1OddDigit(int num) {
        while (num > 0) {
            if ((num % 10) % 2 != 0) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

    static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
