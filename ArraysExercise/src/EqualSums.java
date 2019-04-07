import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int leftSum, rightSum;
        int currentIndex = 0;
        int len = numbers.length;
        boolean isEqualSums = false;


        for (int i = 0; i < len; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < len; j++) {
                if (j < i) {
                    leftSum += numbers[j];
                } else if (j > i) {
                    rightSum += numbers[j];
                }
            }
            if (leftSum == rightSum) {
                currentIndex = i;
                isEqualSums = true;
                break;
            }
        }
        System.out.println(isEqualSums ? currentIndex : "no");

    }
}
