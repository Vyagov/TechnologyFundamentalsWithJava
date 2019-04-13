import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());

        int product;

        while (true) {
            product = num * count;
            System.out.println(String.format("%d X %d = %d", num, count, product));

            if (count >= 10) {
                break;
            }
            count++;
        }
    }
}
