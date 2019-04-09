import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int numOfLines = Integer.parseInt(scanner.nextLine());

        String result = "";

        for (int line = 0; line < numOfLines; line++) {
            char letter = scanner.nextLine().charAt(0);

            letter += key;
            result += letter;
        }
        System.out.println(result);
    }
}
