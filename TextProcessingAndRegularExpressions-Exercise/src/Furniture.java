import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^>>(?<furnitureName>[A-Za-z]+)<<" +
                "(?<price>\\d+\\.?\\d*)!" +
                "(?<quantity>\\d+)\\b";
        Pattern pattern = Pattern.compile(regex);
        String input;
        double spendMoney = 0.0;
        System.out.println("Bought furniture:");

        while (!"Purchase".equals(input = scanner.nextLine())) {

            Matcher matcher = pattern.matcher(input);
            double totalPrice = 0.0;

            if (matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                totalPrice = quantity * price;

                System.out.println(furnitureName);
            }
            spendMoney += totalPrice;
        }
        System.out.println(String.format("Total money spend: %.2f", spendMoney));
    }
}
