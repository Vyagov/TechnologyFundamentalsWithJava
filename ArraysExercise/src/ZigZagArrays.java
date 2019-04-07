import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int first = 0;
        int second = 1;
        String firstSequence = "";
        String secondSequence = "";

        for (int line = 0; line < lines; line++) {
            String[] numbers = scanner.nextLine().split(" ");

            if (line % 2 == 0) {
                firstSequence += numbers[first] + " ";
                secondSequence += numbers[second] + " ";
            } else {
                firstSequence += numbers[second] + " ";
                secondSequence += numbers[first] + " ";
            }
        }
        System.out.println(firstSequence.trim());
        System.out.println(secondSequence.trim());
    }
}
