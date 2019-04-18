import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfFlour = Double.parseDouble(scanner.nextLine());
        double priceOfEgg = Double.parseDouble(scanner.nextLine());
        double priceOfApron = Double.parseDouble(scanner.nextLine());

        int discountFlout = students / 5;
        double totalFlourPrice = (students - discountFlout) * priceOfFlour;
        double totalApronPrice = (students + Math.ceil(students * 20 / 100.0)) * priceOfApron;
        double totalEggPrice = 10 * priceOfEgg * students;
        double itemsPrice = totalApronPrice + totalEggPrice + totalFlourPrice;

        if (itemsPrice <= budget) {
            System.out.println(String.format("Items purchased for %.2f$.", itemsPrice));
        } else {
            double diff = itemsPrice - budget;
            System.out.println(String.format("%.2f$ more needed.", diff));
        }
    }
}
