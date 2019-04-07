import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int givenSum = Integer.parseInt(scanner.nextLine());

        int len = numbers.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int currentSum = numbers[i] + numbers[j];

                if (currentSum == givenSum) {
                    System.out.println(String.format("%d %d", numbers[i], numbers[j]));
                }
            }
        }
    }
}
