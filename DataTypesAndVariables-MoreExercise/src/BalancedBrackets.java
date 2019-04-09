import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        boolean open = false;
        boolean isBalanced = false;
        int countOpen = 0;
        int countClosed = 0;

        for (int line = 0; line < numOfLines; line++) {
            String str = scanner.nextLine();

            if (str.equals("(")) {
                countOpen++;

                if (countOpen > 1) {
                    isBalanced = false;
                    break;
                }
                open = true;
                isBalanced = false;
                countClosed = 0;
            }
            if (str.equals(")")) {
                countClosed++;

                if (countClosed > 1 || !open) {
                    isBalanced = false;
                    break;
                }
                open = false;
                isBalanced = true;
                countOpen = 0;
            }
        }
        String result = isBalanced ? "BALANCED" : "UNBALANCED";
        System.out.println(result);
    }
}
