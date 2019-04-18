import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder chars = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            if (Character.isDigit(symbol)) {
                digits.append(symbol);
                continue;
            }
            if (Character.isLetter(symbol)) {
                letters.append(symbol);
                continue;
            }
            if (!Character.isLetterOrDigit(symbol)) {
                chars.append(symbol);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(chars);
    }
}
