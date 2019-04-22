import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        signOfInteger(number);
    }

    public static void signOfInteger(int num) {
        if (num < 0) {
            System.out.println(String.format("The number %d is negative.", num));
        } else if (num > 0) {
            System.out.println(String.format("The number %d is positive.", num));
        } else {
            System.out.println(String.format("The number %d is zero.", num));
        }
    }
}
