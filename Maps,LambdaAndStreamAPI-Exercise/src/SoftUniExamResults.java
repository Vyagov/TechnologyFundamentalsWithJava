import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        Map<String, Integer> results = new LinkedHashMap<>();
        Map<String, Integer> submissions = new LinkedHashMap<>();

        while (!"exam finished".equals(input = scanner.nextLine())) {
            String[] firstData = input.split("-", 2);
            String name = firstData[0];

            if (!"banned".equals(firstData[1])) {
                String[] secondData = firstData[1].split("-");
                String language = secondData[0];
                Integer points = Integer.parseInt(secondData[1]);

                if (!results.containsKey(name) || results.get(name) < points) {
                    results.put(name, points);
                }
                if (!submissions.containsKey(language)) {
                    submissions.put(language, 1);
                } else {
                    submissions.put(language, submissions.get(language) + 1);
                }
            } else {
                results.remove(name);
            }
        }
        System.out.println("Results:");
        results.entrySet().stream()
                .sorted((e2, e1) -> {
                    int sort = e1.getValue().compareTo(e2.getValue());

                    if (sort == 0) {
                        sort = e2.getKey().compareTo(e1.getKey());
                    }
                    return sort;
                })
                .forEach(e -> System.out.println(String.format("%s | %d", e.getKey(), e.getValue())));
        System.out.println("Submissions:");
        submissions.entrySet().stream()
                .sorted((e2, e1) -> {
                    int sort = e1.getValue().compareTo(e2.getValue());

                    if (sort == 0) {
                        sort = e2.getKey().compareTo(e1.getKey());
                    }
                    return sort;
                })
                .forEach(e -> System.out.println(String.format("%s - %d", e.getKey(), e.getValue())));
    }
}
