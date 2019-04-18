import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] itemsWithPrices = scanner.nextLine().split("\\|+");
        double budget = Double.parseDouble(scanner.nextLine());

        double moneyForTicket = 150.00;
        String result = "";
        double sumPrice = 0;
        double currentBudget = budget;

        for (int i = 0; i < itemsWithPrices.length; i++) {
            String[] itemWithPrice = itemsWithPrices[i].split("->");

            double price = Double.parseDouble(itemWithPrice[1]);

            if ("clothes".equalsIgnoreCase(itemWithPrice[0])) {
                if (price > 50.00) {
                    continue;
                }
            } else if ("shoes".equalsIgnoreCase(itemWithPrice[0])) {
                if (price > 35.00) {
                    continue;
                }
            } else if ("accessories".equalsIgnoreCase(itemWithPrice[0])) {
                if (price > 20.50) {
                    continue;
                }
            }
            if (currentBudget >= price) {
                currentBudget -= price;
                price += price * 40.0 / 100;
                sumPrice += price;
                result += String.format("%.2f ", price);
            }
        }
        currentBudget += sumPrice;
        double profit = currentBudget - budget;

        System.out.println(result.trim());
        System.out.println(String.format("Profit: %.2f", profit));

        if (currentBudget >= moneyForTicket) {
            System.out.println("Hello, France!");
        } else {
            System.out.println("Time to go.");
        }
    }
}
