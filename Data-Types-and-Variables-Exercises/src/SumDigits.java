import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        int len = number.length();
        int currentDigit;
        int sumDigit = 0;
        char ch;

        for (int digit = 0; digit < len; digit++) {
            ch = number.charAt(digit);
            currentDigit = Character.getNumericValue(ch);

            sumDigit += currentDigit;
        }

        System.out.println(sumDigit);
    }
}
