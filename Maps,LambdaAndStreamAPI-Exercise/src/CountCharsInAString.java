import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = String.join("", scanner.nextLine().split("\\s+"));

        Map<Character, Integer> countSymbol = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            countSymbol.putIfAbsent(symbol, 0);
            countSymbol.put(symbol, countSymbol.get(symbol) + 1);
        }

        countSymbol.forEach((key, value) -> System.out.println(String.format("%c -> %d", key, value)));
    }
}
