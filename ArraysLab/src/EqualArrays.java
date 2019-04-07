import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int diffIndex = 0;
        boolean isIdentical = true;

        for (int index = 0; index < secondArray.length; index++) {
            sum += firstArray[index];

            if (firstArray[index] != secondArray[index]) {
                diffIndex = index;
                isIdentical = false;
                break;
            }
        }
        if (isIdentical) {
            System.out.println("Arrays are identical. Sum: " + sum);
        } else {
            System.out.println(String.format("Arrays are not identical. Found difference at %d index.", diffIndex));
        }
    }
}
