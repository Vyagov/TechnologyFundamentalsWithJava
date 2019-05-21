import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input;

        while (!"End".equalsIgnoreCase(input = scanner.nextLine())) {
            String[] commands = input.split("\\s+");
            int index;
            int len = numbers.size();

            switch (commands[0]) {
                case "Add":
                    numbers.add(commands[1]);
                    break;
                case "Insert":
                    index = Integer.parseInt(commands[2]);

                    if (index >= len || index < 0) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(index, commands[1]);
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(commands[1]);

                    if (index >= len || index < 0) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(index);
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(commands[2]);

                    if ("left".equalsIgnoreCase(commands[1])) {
                        shiftLeft(numbers, count);
                    } else if ("right".equalsIgnoreCase(commands[1])) {
                        shiftRight(numbers, count);
                    }
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }

    static List<String> shiftLeft(List<String> str, int count) {
        while (count-- > 0) {
            str.add(str.get(0));
            str.remove(0);
        }
        return str;
    }

    static List<String> shiftRight(List<String> str, int count) {
        int len = str.size();

        while (count-- > 0) {
            str.add(0, str.get(len - 1));
            str.remove(len);
        }
        return str;
    }
}
