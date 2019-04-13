import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int len = input.length();
        int digit, number, factorial;
        String result;
        int totalFactorial = 0;

        for (int i = 0; i < len; i++) {
            digit = Integer.parseInt("" + input.charAt(i));
            factorial = 1;

            for (int j = 1; j <= digit; j++) {
                factorial *= j;
            }
            totalFactorial += factorial;

        }
        number = Integer.parseInt(input);

        result = totalFactorial == number ? "yes" : "no";

        System.out.println(result);
    }
}
