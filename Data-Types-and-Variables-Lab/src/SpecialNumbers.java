import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum;
        int lastDigit, currentNum;
        String result;

        for (int num = 1; num <= number; num++) {
            currentNum = num;
            result = currentNum + " -> ";
            sum = 0;

            while (currentNum != 0) {
                lastDigit = currentNum % 10;
                currentNum /= 10;
                sum += lastDigit;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                result += "True";
            } else {
                result += "False";
            }
            System.out.println(result);
        }
    }
}
