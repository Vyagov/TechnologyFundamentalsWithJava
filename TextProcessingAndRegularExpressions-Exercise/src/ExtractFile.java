import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathToFile = scanner.nextLine();
        String regex = "(^|(?<=\\\\))(?<name>[\\w\\s.-]+)[.](?<extension>[a-z]+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pathToFile);

        while (matcher.find()) {
            String fileName = matcher.group("name");
            String fileExtension = matcher.group("extension");

            System.out.println("File name: " + fileName);
            System.out.println("File extension: " + fileExtension);
        }
    }
}
