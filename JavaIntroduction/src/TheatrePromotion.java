import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int weekDayAge0to18 = 12;
        int weekDayAge18to64 = 18;
        int weekDayAge64to122 = 12;

        int weekendAge0to18 = 15;
        int weekendAge18to64 = 20;
        int weekendAge64to122 = 15;

        int holidayAge0to18 = 5;
        int holidayAge18to64 = 12;
        int holidayAge64to122 = 10;

        int ticketPrice = 0;
        boolean error = false;

        switch (typeOfDay) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = weekDayAge0to18;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = weekDayAge18to64;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = weekDayAge64to122;
                } else {
                    error = true;
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    ticketPrice = weekendAge0to18;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = weekendAge18to64;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = weekendAge64to122;
                } else {
                    error = true;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = holidayAge0to18;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = holidayAge18to64;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = holidayAge64to122;
                } else {
                    error = true;
                }
                break;
        }

        if (error) {
            System.out.println("Error!");
        } else {
            System.out.println(ticketPrice + "$");
        }
    }
}
