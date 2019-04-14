import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s\\|\\s");
        String[] words = scanner.nextLine().split("\\s\\|\\s");
        String command = scanner.nextLine();

        Map<String, List<String>> wordsAndDescriptions = new LinkedHashMap<>();

        for (String str : input) {
            String[] data = str.split(":\\s");

            String word = data[0];
            String description = data[1];

            if (!wordsAndDescriptions.containsKey(word)) {
                wordsAndDescriptions.put(word, new ArrayList<>());
            }
            wordsAndDescriptions.get(word).add(description);
        }
        for (String word : words) {
            if (wordsAndDescriptions.containsKey(word)) {
                System.out.println(word);
                wordsAndDescriptions.get(word).stream()
                        .sorted(Comparator.comparingInt(String::length).reversed())
                        .forEach(e -> System.out.println(" -" + e));
            }
        }
        if (command.equals("List")) {
            wordsAndDescriptions.entrySet().stream()
                    .sorted(Comparator.comparing(Map.Entry::getKey))
                    .forEach(e -> System.out.print(e.getKey() + " "));
        }
    }
}
