import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String inputArr = scanner.nextLine();
//        String[] strArray = inputArr.split(" ");
//        int[] numArray = new int[strArray.length];
//
//        for (int i = 0; i < numArray.length; i++) {
//            numArray[i] = Integer.parseInt(strArray[i]);
//        }

        int[] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;

        for (int num = 0; num < numArray.length; num++) {
            if (numArray[num] % 2 == 0) {
                evenSum += numArray[num];
            }
        }
        System.out.println(evenSum);

    }
}

