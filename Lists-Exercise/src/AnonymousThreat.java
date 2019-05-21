import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input;

        while (!"3:1".equals(input = scanner.nextLine())) {
            String[] command = input.split("\\s+");

            switch (command[0].toLowerCase()) {
                case "merge":
                    int startIndex = validateIndex(Integer.parseInt(command[1]), data.size());
                    int endIndex = validateIndex(Integer.parseInt(command[2]), data.size());

                    int count = endIndex - startIndex;
                    String currentElem = "";

                    while (count-- >= 0) {
                        currentElem += data.get(startIndex);
                        data.remove(startIndex);
                    }
                    data.add(startIndex, currentElem);
                    break;
                case "divide":
                    int index = Integer.parseInt(command[1]);
                    int partitions = Integer.parseInt(command[2]);

                    String elem = data.get(index);
                    List<String> result = new ArrayList<>();
                    int part = elem.length() / partitions;
                    int len = elem.length();

                    for (int i = 0; i < elem.length(); i += part) {
                        if (result.size() < partitions - 1) {
                            result.add(elem.substring(i, i + part));
                        } else {
                            result.add(elem.substring(i, len));
                            break;
                        }
                    }
                    data.remove(index);
                    data.addAll(index, result);
                    break;
            }
        }
        System.out.println(data.toString().replaceAll("[\\[,\\]]", ""));
    }

    private static int validateIndex(int index, int length) {
        if (index < 0) {
            index = 0;
        }
        if (index > length - 1) {
            index = length - 1;
        }
        return index;
    }
}
