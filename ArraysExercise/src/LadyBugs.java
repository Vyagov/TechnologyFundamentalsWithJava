import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeField = Integer.parseInt(scanner.nextLine());
        int[] allLadybugsIndexes = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int ladybug = 1;
        int[] field = new int[sizeField];

        for (int allLadybugsIndex : allLadybugsIndexes) {
            if (allLadybugsIndex >= 0 && allLadybugsIndex < field.length) {
                field[allLadybugsIndex] = ladybug;
            }
        }
        String inputData;

        while (!"end".equals(inputData = scanner.nextLine())) {
            String[] command = inputData.split("\\s+");

            int ladybugIndex = Integer.parseInt(command[0]);
            String direction = command[1];
            int flyLength = Integer.parseInt(command[2]);

            if (!(ladybugIndex >= 0 && ladybugIndex < field.length && field[ladybugIndex] == ladybug)) {
                continue;
            }
            int currentIndex = ladybugIndex;
            field[currentIndex] = 0;

            while (true) {
                switch (direction) {
                    case "right":
                        currentIndex += flyLength;
                        break;
                    case "left":
                        currentIndex -= flyLength;
                        break;
                }
                if (currentIndex < 0 || currentIndex >= field.length) {
                    break;
                }
                if (field[currentIndex] == 0) {
                    field[currentIndex] = ladybug;
                    break;
                }
            }
        }
        for (int bug : field) {
            System.out.print(bug + " ");
        }
    }
}
