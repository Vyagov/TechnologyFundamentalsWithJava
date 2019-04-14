import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usernames = scanner.nextLine();

        String regex = "(^|(?<=\\s))[\\w\\-]{3,16}($|(?=,))";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(usernames);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
