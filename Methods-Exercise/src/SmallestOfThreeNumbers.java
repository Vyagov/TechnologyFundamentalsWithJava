import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int minElement = smallestNumber(firstNumber, secondNumber);

        System.out.println(smallestNumber(minElement, thirdNumber));
    }

    public static int smallestNumber(int num1, int num2) {
        if (num1 <= num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
