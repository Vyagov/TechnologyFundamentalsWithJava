import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount  = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadset = lostGamesCount / 2;
        int trashedMouse = lostGamesCount / 3;
        int trashedKeyboard = lostGamesCount / 6;
        int trashedDisplay = trashedKeyboard / 2;

        double expenseHeadset = headsetPrice * trashedHeadset;
        double expenseMouse = mousePrice * trashedMouse;
        double expenseKeyboard = keyboardPrice * trashedKeyboard;
        double expenseDisplay = displayPrice * trashedDisplay;

        double totalExpense = expenseHeadset + expenseMouse + expenseKeyboard + expenseDisplay;

        System.out.println(String.format("Rage expenses: %.2f lv.", totalExpense));
    }
}
