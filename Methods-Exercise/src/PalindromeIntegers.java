import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number;

        while (!"END".equalsIgnoreCase(number = scanner.nextLine())) {
            System.out.println(isPalindrome(number));
        }
    }

    static boolean isPalindrome(String num) {
        int len = num.length();

        for (int i = 0; i < len / 2; i++) {
            if (num.charAt(i) != num.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
