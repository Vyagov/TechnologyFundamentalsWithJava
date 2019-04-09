import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());

        int years, days, hours, minutes;

        years = 100 * centuries;
        days = (int) (365.2422 * years);
        hours = 24 * days;
        minutes = 60 * hours;

        System.out.println(String.format("%d centuries = %d years = %d days = %d hours = %d minutes",
                                            centuries, years, days, hours, minutes));
    }
}
