import java.util.Scanner;

public class BreadFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] workingEvents = scanner.nextLine().split("\\|+");

        int energy = 100;
        int coins = 100;

        for (int i = 0; i < workingEvents.length; i++) {
            String[] currentEvent = workingEvents[i].split("-+");

            switch (currentEvent[0].toLowerCase()) {
                case "rest":
                    int currentEnergy = Integer.parseInt(currentEvent[1]);

                    if (energy + currentEnergy <= 100) {
                        System.out.println(String.format("You gained %d energy.", currentEnergy));
                        energy += currentEnergy;
                    } else {
                        System.out.println(String.format("You gained %d energy.", 100 - energy));
                        energy = 100;
                    }
                    System.out.println(String.format("Current energy: %d.", energy));
                    break;
                case "order":
                    int currentCoins = Integer.parseInt(currentEvent[1]);

                    if (energy >= 30) {
                        energy -= 30;
                        coins += currentCoins;
                        System.out.println(String.format("You earned %d coins.", currentCoins));
                    } else {
                        energy += 50;
                        System.out.println("You had to rest!");
                    }
                    break;
                default:
                    coins -= Integer.parseInt(currentEvent[1]);

                    if (coins > 0) {
                        System.out.println(String.format("You bought %s.", currentEvent[0]));
                    } else {
                        System.out.println(String.format("Closed! Cannot afford %s.", currentEvent[0]));
                        return;
                    }
                    break;
            }
        }
        System.out.println("Day completed!");
        System.out.println("Coins: " + coins);
        System.out.println("Energy: " + energy);
    }
}
