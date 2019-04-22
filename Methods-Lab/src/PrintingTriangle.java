import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int col = 1; col <= input; col++) {
            printLine(1, col);
            System.out.println();
        }
        for (int col = input - 1; col > 0; col--) {
            printLine(1, col);
            System.out.println();
        }

    }

    public static void printLine(int start, int end) {
        for (int row = start; row <= end; row++) {
            System.out.print(row + " ");
        }
    }
}
