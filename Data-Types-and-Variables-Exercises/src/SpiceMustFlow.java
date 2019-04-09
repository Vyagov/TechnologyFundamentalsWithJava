import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int day = 0;
        int workersConsume = 26;
        int totalAmountOfSpiceExtracted = 0;

        while (startingYield >= 100) {
            totalAmountOfSpiceExtracted += startingYield;
            totalAmountOfSpiceExtracted -= workersConsume;
            startingYield -= 10;
            day++;
        }
        if (totalAmountOfSpiceExtracted >= workersConsume) {
            totalAmountOfSpiceExtracted -= workersConsume;
        }
        System.out.println(day);
        System.out.println(totalAmountOfSpiceExtracted);
    }
}
