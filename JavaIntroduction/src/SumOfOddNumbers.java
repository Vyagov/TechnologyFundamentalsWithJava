import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int oddNum = 1;
        int sumOddNum = 0;

        while (!(count++ == num)) {
            System.out.println(oddNum);
            sumOddNum += oddNum;
            oddNum += 2;
        }
        System.out.println("Sum: " + sumOddNum);
    }
}
