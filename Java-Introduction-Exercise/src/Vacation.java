import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine().toLowerCase();
        String dayOfWeek = scanner.nextLine().toLowerCase();

        double studentsFriday = 8.45;
        double studentsSaturday = 9.80;
        double studentsSunday = 10.46;

        double businessFriday = 10.90;
        double businessSaturday = 15.60;
        double businessSunday = 16.00;

        double regularFriday = 15.00;
        double regularSaturday = 20.00;
        double regularSunday = 22.50;

        double totalPrice = 0;

        if (typeOfGroup.equals("business") && groupOfPeople >= 100) {
            groupOfPeople -= 10;
        }
        
        switch (typeOfGroup) {
            case "students":
                switch (dayOfWeek) {
                    case "friday":
                        totalPrice = studentsFriday * groupOfPeople;
                        break;
                    case "saturday":
                        totalPrice = studentsSaturday * groupOfPeople;
                        break;
                    case "sunday":
                        totalPrice = studentsSunday * groupOfPeople;
                        break;
                }
                break;
            case "business":
                switch (dayOfWeek) {
                    case "friday":
                        totalPrice = businessFriday * groupOfPeople;
                        break;
                    case "saturday":
                        totalPrice = businessSaturday * groupOfPeople;
                        break;
                    case "sunday":
                        totalPrice = businessSunday * groupOfPeople;
                        break;
                }
                break;
            case "regular":
                switch (dayOfWeek) {
                    case "friday":
                        totalPrice = regularFriday * groupOfPeople;
                        break;
                    case "saturday":
                        totalPrice = regularSaturday * groupOfPeople;
                        break;
                    case "sunday":
                        totalPrice = regularSunday * groupOfPeople;
                        break;
                }
                break;
        }
        if (typeOfGroup.equals("students") && groupOfPeople >= 30) {
            totalPrice -= totalPrice * 15 / 100.0;
        }
        if (typeOfGroup.equals("regular") && (groupOfPeople >= 10 && groupOfPeople <= 20)) {
            totalPrice -= totalPrice * 5 / 100.0;
        }

        System.out.println(String.format("Total price: %.2f", totalPrice));
    }
}
