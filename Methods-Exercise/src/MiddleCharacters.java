import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(middleChar(input));
    }

    public static String middleChar(String str) {
        int len = str.length();

        if (len % 2 == 0) {
            return str.charAt((len / 2) - 1) + "" + str.charAt(len / 2);
        }
        return str.charAt(len / 2) + "";
    }
}
