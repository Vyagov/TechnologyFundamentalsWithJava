import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input;

        while (!"end".equalsIgnoreCase(input = scanner.nextLine())) {
            String[] commands = input.split("\\s+");
            String command = commands[0];

            switch (command) {
                case "Add":
                    int numAdd = Integer.parseInt(commands[1]);
                    numbers.add(numAdd);
                    break;
                case "Remove":
                    int numRemove = Integer.parseInt(commands[1]);

                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == numRemove) {
                            numbers.remove(i);
                            i--;
                        }
                    }
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(commands[1]);
                    numbers.remove(indexRemove);
                    break;
                case "Insert":
                    int num = Integer.parseInt(commands[1]);
                    int indexInsert = Integer.parseInt(commands[2]);
                    numbers.add(indexInsert, num);
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }
}
