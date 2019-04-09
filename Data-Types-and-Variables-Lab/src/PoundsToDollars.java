import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double britishPounds = Double.parseDouble(scanner.nextLine());

        double usDollars = britishPounds * 1.31;

        System.out.println(String.format("%.3f",usDollars));
    }
}
