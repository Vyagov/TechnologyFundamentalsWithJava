import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNames = scanner.nextLine().split(", ");

        Map<String, Integer> racers = new LinkedHashMap<>();

        for (String name : inputNames) {
            racers.put(name, 0);
        }

        String regexDigit = "([0-9])";
        String regexName = "([A-Za-z])";

        Pattern patternDigit = Pattern.compile(regexDigit);
        Pattern patternName = Pattern.compile(regexName);
        String input;

        while (!"end of race".equals(input = scanner.nextLine())) {

            Matcher matcherDigit = patternDigit.matcher(input);
            Matcher matcherName = patternName.matcher(input);
            StringBuilder racerName = new StringBuilder();
            int distance = 0;

            while (matcherDigit.find()) {
                int digit = Integer.parseInt(matcherDigit.group());
                distance += digit;
            }
            while (matcherName.find()) {
                String letter = matcherName.group();
                racerName.append(letter);
            }
            if (racers.containsKey(racerName.toString())) {
                racers.put(racerName.toString(), racers.get(racerName.toString()) + distance);
            }
        }
        List<String> winners = new ArrayList<>();

        racers.entrySet().stream().sorted((e2, e1) ->
                e1.getValue().compareTo(e2.getValue())).limit(3).forEach(e -> {
            winners.add(e.getKey());
        });

        System.out.println("1st place: " + winners.get(0));
        System.out.println("2nd place: " + winners.get(1));
        System.out.println("3rd place: " + winners.get(2));
    }
}
