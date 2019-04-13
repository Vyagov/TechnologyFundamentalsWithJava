import java.sql.Struct;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int divisible = 0;

        if (number % 2 == 0) {
            divisible = 2;
        }
        if (number % 3 == 0) {
            divisible = 3;
        }
        if (number % 6 == 0) {
            divisible = 6;
        }
        if (number % 7 == 0) {
            divisible = 7;
        }
        if (number % 10 == 0) {
            divisible = 10;
        }

        if (divisible == 0) {
            System.out.println("Not divisible");
        } else {
            System.out.println(String.format("The number is divisible by %d", divisible));
        }
    }
}
