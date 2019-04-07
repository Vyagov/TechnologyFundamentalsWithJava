import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int currentNum = numbers[0];
        int currentCount = 0;
        int numLongestSequence = numbers[0];
        int maxCount = 0;
        String result = "";

        for (int num = 0; num < numbers.length - 1; num++) {
            if (numbers[num] == numbers[num + 1]) {
                currentNum = numbers[num];
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    numLongestSequence = currentNum;
                    maxCount = currentCount;
                }
                currentCount = 0;
            }
        }
        if (currentCount > maxCount) {
            numLongestSequence = currentNum;
            maxCount = currentCount;
        }
        for (int i = 0; i <= maxCount; i++) {
            result += numLongestSequence + " ";
        }
        System.out.println(result.trim());
    }
}
