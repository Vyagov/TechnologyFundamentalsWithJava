import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = mathPower(number, power);

        System.out.println(df.format(result));
    }

    public static double mathPower(double num, int pow) {
        double result = 1;

        for (int i = 1; i <= pow; i++) {
            result *= num;
        }
        return result;
    }
}
