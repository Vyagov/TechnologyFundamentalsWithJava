import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String buyingGame = scanner.nextLine();

        double priceOutFall4 = 39.99;
        double priceCSOG = 15.99;
        double priceZplinterZell = 19.99;
        double priceHonored2 = 59.99;
        double priceRoverWatch = 29.99;
        double priceRoverWatchOriginsEdition = 39.99;

        double priceGame = 0;
        double spent;
        double currentBalance = balance;
        boolean noMoney = false;

        while (!"Game Time".equalsIgnoreCase(buyingGame)) {
            switch (buyingGame) {
                case "OutFall 4":
                    priceGame = priceOutFall4;
                    break;
                case "CS: OG":
                    priceGame = priceCSOG;
                    break;
                case "Zplinter Zell":
                    priceGame = priceZplinterZell;
                    break;
                case "Honored 2":
                    priceGame = priceHonored2;
                    break;
                case "RoverWatch":
                    priceGame = priceRoverWatch;
                    break;
                case "RoverWatch Origins Edition":
                    priceGame = priceRoverWatchOriginsEdition;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (currentBalance < priceGame) {
                System.out.println("Too Expensive");
            } else {
                currentBalance -= priceGame;

                if (currentBalance == 0) {
                    System.out.println("Out of money!");
                    noMoney = true;
                    break;
                } else {
                    System.out.println("Bought " + buyingGame);
                }
            }
            buyingGame = scanner.nextLine();
        }
        if (!noMoney) {
            spent = balance - currentBalance;
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, currentBalance);
        }
        System.out.println();
    }
}
