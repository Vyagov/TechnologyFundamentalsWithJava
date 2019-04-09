import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal numA = new BigDecimal(scanner.nextLine());
        BigDecimal numB = new BigDecimal(scanner.nextLine());

        BigDecimal eps = new BigDecimal(0.000001);
        BigDecimal diff = numA.subtract(numB);
        diff = diff.abs();
        String result = eps.compareTo(diff) > 0 ? "True" : "False";

        System.out.println(result);
    }
}
