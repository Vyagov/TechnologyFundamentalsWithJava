import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numberOfRotations = Integer.parseInt(scanner.nextLine());

        int len = numbers.length;
        int rotationIndex = numberOfRotations % len;
        String result = "";

        for (int rotation = rotationIndex; rotation < len + rotationIndex; rotation++) {
            result += rotation < len ? numbers[rotation] + " " : numbers[rotation - len] + " ";
        }
        System.out.println(result.trim());
    }
}
