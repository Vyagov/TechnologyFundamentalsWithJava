import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNum = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());

        StringBuilder result = new StringBuilder();

        if (num == 0) {
            result.append(num);
        } else if (num == 1) {
            result.append(bigNum);
        } else if (num > 1) {
            result.append(productBigNum(bigNum, num));
            result = result.reverse();
        }
        System.out.println(result);
    }

    private static String productBigNum(String str, int num) {
        StringBuilder result = new StringBuilder();
        int diff = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(str.charAt(i));
            int product = digit * num;
            int tens = (product + diff) % 10;
            diff = (product + diff) / 10;
            result.append(tens);
        }
        if (diff != 0) {
            result.append(diff);
        }
        return result.toString();
    }
}
