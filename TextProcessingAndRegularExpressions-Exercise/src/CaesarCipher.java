import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputStr = scanner.nextLine();

        String result = encryptString(inputStr);

        System.out.println(result);
    }

    private static String encryptString(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = (char) (str.charAt(i) + 3);
            result.append(ch);
        }
        return result.toString();
    }
}
