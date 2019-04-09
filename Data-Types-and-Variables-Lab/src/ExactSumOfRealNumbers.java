import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNum = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int num = 0; num < countNum; num++) {
            BigDecimal currentNum = new BigDecimal(scanner.nextLine());
            sum = sum.add(currentNum);
        }

        System.out.println(sum);
    }
}
