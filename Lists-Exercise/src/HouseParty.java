import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List<String> nameList = new ArrayList<>();

        for (int i = 0; i < numberOfCommands; i++) {
            List<String> commands = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

            boolean isInList = commands.contains("not");
            String currentName = commands.get(0);

            if (isInList) {
                if (!nameList.contains(currentName)) {
                    System.out.println(currentName + " is not in the list!");
                } else {
                    nameList.remove(currentName);
                }
            } else {
                if (nameList.contains(currentName)) {
                    System.out.println(currentName + " is already in the list!");
                } else {
                    nameList.add(currentName);
                }
            }
        }
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
