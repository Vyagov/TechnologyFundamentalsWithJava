import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int group = Integer.parseInt(scanner.nextLine());
        double fuelPerKilometer = Double.parseDouble(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double priceForRoom = Double.parseDouble(scanner.nextLine());

        double totalFood = food * group * day;
        double totalHotelPrice = priceForRoom * group * day;

        if (group > 10) {
            totalHotelPrice -= totalHotelPrice * 25.0 / 100;
        }

        double currentExpenses = totalFood + totalHotelPrice;

        for (int i = 1; i <= day; i++) {
            double travelledDistance = Double.parseDouble(scanner.nextLine());

            double fuelExpenses = travelledDistance * fuelPerKilometer;
            currentExpenses += fuelExpenses;

            if (i % 3 == 0 && budget >= currentExpenses) {
                currentExpenses += currentExpenses * 40.0 / 100;
            }
            if (i % 5 == 0 && budget >= currentExpenses) {
                currentExpenses += currentExpenses * 40.0 / 100;
            }
            if (i % 7 == 0 && budget >= currentExpenses) {
                currentExpenses -= currentExpenses / group;
            }
            if (budget < currentExpenses) {
                System.out.print("Not enough money to continue the trip. ");
                System.out.println(String.format("You need %.2f$ more.", currentExpenses - budget)) ;
                return;
            }
        }

        if (budget >= currentExpenses) {
            System.out.println(String.format("You have reached the destination. You have %.2f$ budget left.", budget - currentExpenses));
        }
    }
}
