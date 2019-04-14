import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputStr = scanner.nextLine();

        String result = deleteRepeatingChars(inputStr);

        System.out.println(result);
    }

    private static String deleteRepeatingChars(String str) {
        StringBuilder result = new StringBuilder();
        int symbol = 0;

        while (symbol < str.length()) {
            while (symbol < str.length() - 1 && str.charAt(symbol) == str.charAt(symbol + 1)) {
                symbol++;
            }
            result.append(str.charAt(symbol));
            symbol++;
        }
        return result.toString();
    }
}
