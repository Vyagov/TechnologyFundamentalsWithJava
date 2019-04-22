import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double coffeePrice = 1.50;
        double waterPrice = 1.00;
        double cokePrice = 1.40;
        double snacksPrice = 2.00;

        switch (product.toLowerCase()) {
            case "coffee":
                totalPrice(coffeePrice, quantity);
                break;
            case "water":
                totalPrice(waterPrice, quantity);
                break;
            case "coke":
                totalPrice(cokePrice, quantity);
                break;
            case "snacks":
                totalPrice(snacksPrice, quantity);
                break;
        }
    }

    public static void totalPrice(double price, int quantity) {
        double result = price * quantity;

        System.out.println(String.format("%.2f", result));
    }
}
