import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] numArray = new int[number];

        for (int index = 0; index < numArray.length; index++) {
            numArray[index] = Integer.parseInt(scanner.nextLine());
        }
        String result = "";

        for (int revIndex = numArray.length - 1; revIndex >= 0; revIndex--) {
            result += numArray[revIndex] + " ";
        }
        System.out.println(result.trim());
    }
}
