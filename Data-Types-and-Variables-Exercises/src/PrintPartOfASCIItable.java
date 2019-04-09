import java.util.Scanner;

public class PrintPartOfASCIItable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCharIndex = Integer.parseInt(scanner.nextLine());
        int lastCharIndex = Integer.parseInt(scanner.nextLine());

        char symbolASCII;
        int sumLetterASCII = 0;

        for (int charIndex = startCharIndex; charIndex <= lastCharIndex; charIndex++) {
            symbolASCII = (char) charIndex;
            System.out.print(symbolASCII + " ");
        }
    }
}
