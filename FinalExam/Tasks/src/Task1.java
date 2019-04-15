import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        while (!"Last note".equals(input = scanner.nextLine())) {
            String regex = "^(?<name>[A-Za-z0-9!@#$?]+)=(?<lenHash>\\d+)<<(?<geohash>.+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            String nameOfPeak;
            int lenHash;
            String geohash;

            if (matcher.find()) {
                nameOfPeak = matcher.group("name");
                lenHash = Integer.parseInt(matcher.group("lenHash"));
                geohash = matcher.group("geohash");
            } else {
                System.out.println("Nothing found!");
                continue;
            }
            if (lenHash != geohash.length()) {
                System.out.println("Nothing found!");
                continue;
            }
            nameOfPeak = removeSymbols(nameOfPeak);

            System.out.println(String.format("Coordinates found! %s -> %s", nameOfPeak, geohash));
        }
    }

    private static String removeSymbols(String str) {
        String regex = "[A-Za-z0-9]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            result.append(matcher.group());
        }
        return result.toString();
    }
}
