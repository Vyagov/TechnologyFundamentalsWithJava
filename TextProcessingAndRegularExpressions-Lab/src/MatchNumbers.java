import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        String regex = "(^|(?<=\\s))-?\\d+(\\.\\d+)?($|(?=\\s))";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numbers);

        List<String> result = new ArrayList<>();

        while (matcher.find()) {
            result.add(matcher.group());
        }
        System.out.println(result.toString().replaceAll("[\\[,\\]]", ""));
    }
}
