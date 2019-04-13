import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        double coin;
        double totalMoney = 0;
        double currentPrice;
        String productToLowerCase;
        boolean isValidProduct;

        double priceNuts = 2.00;
        double priceWater = 0.70;
        double priceCrisps = 1.50;
        double priceSoda = 0.80;
        double priceCoke = 1.00;

        while (!"Start".equals(input = scanner.nextLine())) {
            coin = Double.parseDouble(input);

            if (coin == 0.10 || coin == 0.20 || coin == 0.50 || coin == 1.00 || coin == 2.00) {
                totalMoney += coin;
            } else {
                System.out.println(String.format("Cannot accept %.2f", coin));

            }
        }
        String product = scanner.nextLine();

        while (!"End".equals(product)) {
            productToLowerCase = product.toLowerCase();
            isValidProduct = true;
            currentPrice = 0;

            switch (productToLowerCase) {
                case "nuts":
                    currentPrice = priceNuts;
                    break;
                case "water":
                    currentPrice = priceWater;
                    break;
                case "crisps":
                    currentPrice = priceCrisps;
                    break;
                case "soda":
                    currentPrice = priceSoda;
                    break;
                case "coke":
                    currentPrice = priceCoke;
                    break;
                default:
                    isValidProduct = false;
                    System.out.println("Invalid product");
                    break;
            }
            if (isValidProduct) {
                if (totalMoney >= currentPrice) {
                    totalMoney -= currentPrice;
                    System.out.println("Purchased " + product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            product = scanner.nextLine();
        }
        System.out.println(String.format("Change: %.2f", totalMoney));
    }
}
