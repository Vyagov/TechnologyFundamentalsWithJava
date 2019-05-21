import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input;

        while (!"end".equalsIgnoreCase(input = scanner.nextLine())) {
            String[] commands = input.split("\\s+");
            String elem = commands[1];

            if ("delete".equalsIgnoreCase(commands[0])) {
                deleteElements(numbers, elem);
                //numbers = numbers.stream().filter(e -> !e.equals(elem)).collect(Collectors.toList());
            } else if ("insert".equalsIgnoreCase(commands[0])) {
                int position = Integer.parseInt(commands[2]);

                if (position >= 0 && position < numbers.size()) {
                    numbers.add(position, elem);
                }
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }

    static List<String> deleteElements(List<String> data, String numForDelete) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).equals(numForDelete)) {
                data.remove(i);
                i--;
            }
        }
        return data;
    }
}
