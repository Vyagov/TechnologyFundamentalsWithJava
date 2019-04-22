import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        double firstFactorial = calculateFactorial(firstNum);
        double secondFactorial = calculateFactorial(secondNum);

        double result = firstFactorial / secondFactorial;

        System.out.println(String.format("%.2f", result));
    }

    static double calculateFactorial(int num) {
        double factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
