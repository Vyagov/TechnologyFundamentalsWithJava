import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());

        int waterTankCapacity = 255;
        int quantitiesOfWater;
        int currentWaterTankCapacity = 0;

        for (int line = 0; line < numOfLines; line++) {
            quantitiesOfWater = Integer.parseInt(scanner.nextLine());

            currentWaterTankCapacity += quantitiesOfWater;

            if (currentWaterTankCapacity > waterTankCapacity) {
                currentWaterTankCapacity -= quantitiesOfWater;

                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(currentWaterTankCapacity);
    }
}
