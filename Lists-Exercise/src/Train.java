import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());

        String input;

        while (!"end".equalsIgnoreCase(input = scanner.nextLine())) {
            String[] commands = input.split("\\s+");
            int passengers;

            if ("add".equalsIgnoreCase(commands[0])) {
                passengers = Integer.parseInt(commands[1]);
                wagons.add(passengers);
            } else {
                passengers = Integer.parseInt(commands[0]);
                fillWagons(wagons, passengers, capacity);
            }
        }
        System.out.println(wagons.toString().replaceAll("[\\[,\\]]", ""));
    }

    static List<Integer> fillWagons(List<Integer> data, int fill, int limit) {
        for (int i = 0; i < data.size(); i++) {
            int sum = data.get(i) + fill;

            if (sum <= limit) {
                data.set(i, sum);
                break;
            }
        }
        return data;
    }
}
