import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Map<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String wordToLower = word.toLowerCase();

            counts.putIfAbsent(wordToLower, 0);
            counts.put(wordToLower, counts.get(wordToLower) + 1);
        }
        ArrayList<String> odds = new ArrayList<>();

        for (Map.Entry<String, Integer> kvp : counts.entrySet()) {
            if (kvp.getValue() % 2 != 0) {
                odds.add(kvp.getKey());
            }
        }
        System.out.print(odds.toString().replaceAll("[\\[\\]]", ""));
    }
}
