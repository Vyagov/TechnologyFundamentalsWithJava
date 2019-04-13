import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int len = input.length();
        String reverseInput = "";

        for (int symbol = len - 1; symbol >= 0; symbol--) {
            reverseInput += "" + input.charAt(symbol);
        }
        System.out.println(reverseInput);
    }
}
