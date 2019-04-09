import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int num = 2; num <= input; num++) {
            boolean isPrime = true;

            for (int div = 2; div < num; div++) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", num, isPrime);
        }
    }
}
