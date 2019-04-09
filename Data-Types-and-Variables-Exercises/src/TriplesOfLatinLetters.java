import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        char start = 'a';
        char end = (char) ('a' + num);

        for (char firstChar = start; firstChar < end; firstChar++) {
            for (char secondChar = start; secondChar < end; secondChar++) {
                for (char thirdChar = start; thirdChar < end; thirdChar++) {
                    System.out.println(String.format("%c%c%c", firstChar, secondChar, thirdChar));
                }
            }
        }
    }
}
