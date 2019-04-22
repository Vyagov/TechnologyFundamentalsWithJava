import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        charsInRange(firstSymbol, secondSymbol);
    }

    public static void charsInRange(char ch1, char ch2) {
        char start = minCharASCII(ch1, ch2);
        char end = maxCharASCII(ch1, ch2);

        for (int i = start + 1; i < end; i++) {
            if (i > start) {
                System.out.print((char) i + " ");
            }
        }
    }

    public static char minCharASCII(char ch1, char ch2) {
        if (ch1 < ch2) {
            return ch1;
        }
        return ch2;
    }

    public static char maxCharASCII(char ch1, char ch2) {
        if (ch1 > ch2) {
            return ch1;
        }
        return ch2;
    }
}
