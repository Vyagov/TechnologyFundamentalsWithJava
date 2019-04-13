import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSymbols = Integer.parseInt(scanner.nextLine());

        String message = "";
        String number;
        int numberOfDigit, digit, offset, letterIndex, letterCode;
        char mainDigit, letter;

        for (int symbol = 0; symbol < numberOfSymbols; symbol++) {
            number = scanner.nextLine();

            if (number.equals("0")) {
                letter = (char) 32;
            } else {
                numberOfDigit = number.length();
                mainDigit = number.charAt(0);
                digit = Character.getNumericValue(mainDigit);
                offset = (digit - 2) * 3;

                if (digit == 8 || digit == 9) {
                    offset++;
                }
                letterIndex = offset + numberOfDigit - 1;
                letterCode = letterIndex + 97;
                letter = (char) letterCode;
            }
            message += letter;
        }
        System.out.println(message);
    }
}
