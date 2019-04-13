import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int product;

        while (count++ < 10) {
            product = num * count;
            System.out.println(String.format("%d X %d = %d", num, count, product));
        }
    }
}
