import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNum = Integer.parseInt(scanner.nextLine());

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayNum > 0 && dayNum <= 7) {
            System.out.println(days[dayNum - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}