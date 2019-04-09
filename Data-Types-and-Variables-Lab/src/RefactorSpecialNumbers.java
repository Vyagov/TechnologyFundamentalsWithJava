import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum;
        String result;

        for (int num = 1; num <= number; num++) {
            currentNum = num;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                result = "True";
            } else {
                result = "False";
            }

            System.out.printf("%d -> %s%n", currentNum, result);
            sum = 0;
            num = currentNum;
        }
    }
}
