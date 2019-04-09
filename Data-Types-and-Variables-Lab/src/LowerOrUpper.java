import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.next().charAt(0);

        String result = "";

        if (letter >= 'a' && letter <= 'z') {
            result = "lower-case";
        } else if (letter >= 'A' && letter <= 'Z') {
            result = "upper-case";
        }
        System.out.println(result);
    }
}
