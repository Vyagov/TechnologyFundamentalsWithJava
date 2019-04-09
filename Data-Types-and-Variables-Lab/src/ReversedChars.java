import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "";
        String result = "";
        int maxCount = 3;
        char symbol;

        for (int count = 0; count < maxCount; count++) {
            symbol = scanner.next().charAt(0);
            str += "" + symbol;
        }
        for (int count = str.length() - 1; count >= 0; count--) {
            result += str.charAt(count) + " ";
        }
        System.out.println(result);
    }
}
