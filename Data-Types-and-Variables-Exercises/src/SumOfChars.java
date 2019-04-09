import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLetters = Integer.parseInt(scanner.nextLine());

        char letter;
        int sumLetterASCII = 0;

        for (int count = 0; count < numberOfLetters; count++) {
            letter = scanner.nextLine().charAt(0);
            sumLetterASCII += letter;
        }
        System.out.println("The sum equals: " + sumLetterASCII);
    }
}
