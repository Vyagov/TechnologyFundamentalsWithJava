import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int after30Minutes = 30;
        int minutesInOneHour = 60;

        int totalMinutes = minutesInOneHour * hours + minutes + after30Minutes;

        int newHours = totalMinutes / minutesInOneHour;
        int newMinutes = totalMinutes % minutesInOneHour;

        if (newHours > 23) {
            newHours = 0;
        }

        System.out.printf("%d:%02d", newHours, newMinutes);
    }
}
