import java.io.IOException;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean validLength = isValidLength(password);
        boolean validLettersAndDigits = isValidLettersAndDigits(password);
        boolean validLeast2Digits = isValidLeast2Digits(password);

        if (validLength && validLettersAndDigits && validLeast2Digits) {
            System.out.println("Password is valid");
        } else {
            if (!validLength) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!validLettersAndDigits) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!validLeast2Digits) {
                System.out.println("Password must have at least 2 digits");
            }
        }

    }

    public static boolean isValidLength(String str) {
        int len = str.length();

        return len >= 6 && len <= 10;
    }

    public static boolean isValidLettersAndDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidLeast2Digits(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count >= 2;
    }
}
