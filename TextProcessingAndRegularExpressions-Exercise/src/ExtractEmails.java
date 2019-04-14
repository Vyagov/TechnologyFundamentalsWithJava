import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String emails = scanner.nextLine();

        String regex = "(^|(?<=\\s))[A-Za-z][\\w.-]+@[A-Za-z-]+(\\.[A-Za-z]+)+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emails);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
