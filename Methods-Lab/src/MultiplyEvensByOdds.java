import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int result = getMultipleOfEvensAndOdds(Math.abs(number));

        System.out.println(result);
    }

    public static int getMultipleOfEvensAndOdds(int num) {
        int evenSum = getSumOfEvenDigits(num);
        int oddSum = getSumOfOddDigits(num);

        return evenSum * oddSum;
    }

    public static int getSumOfEvenDigits(int num) {
        int evenDigitsSum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                evenDigitsSum += digit;
            }
            num /= 10;
        }
        return evenDigitsSum;
    }

    public static int getSumOfOddDigits(int num) {
        int oddDigitsSum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 != 0) {
                oddDigitsSum += digit;
            }
            num /= 10;
        }
        return oddDigitsSum;
    }
}
