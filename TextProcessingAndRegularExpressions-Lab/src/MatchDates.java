import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dates = scanner.nextLine();
        String regex = "\\b(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher datesMatcher = pattern.matcher(dates);

        while (datesMatcher.find()) {
            String day = datesMatcher.group("day");
            String month = datesMatcher.group("month");
            String year = datesMatcher.group("year");

            System.out.println(String.format("Day: %s, Month: %s, Year: %s", day, month, year));
        }
    }
}
