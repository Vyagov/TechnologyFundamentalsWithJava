import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deciphering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] strForReplace = scanner.nextLine().split("\\s");

        String regex = "^[d-z{}|#]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        String textToDecipher;
        String decipheredText = "";

        if (!matcher.find()) {
            System.out.println("This is not the book you are looking for.");
            return;
        } else {
            textToDecipher = matcher.group();
        }
        for (int i = 0; i < textToDecipher.length(); i++) {
            char symbol = (char) (textToDecipher.charAt(i) - 3);
            decipheredText += symbol + "";
        }
        decipheredText = decipheredText.replace(strForReplace[0], strForReplace[1]);
        System.out.println(decipheredText);
    }
}
