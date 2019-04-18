import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banList = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        String symbol = "*";

        for (String banString : banList) {
            int len = banString.length();

            while (text.contains(banString)) {
                text = text.replace(banString, repeat(symbol, len));
            }
        }
        System.out.println(text);
    }

    private static StringBuilder repeat(String str, int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(str);
        }
        return result;
    }
}
