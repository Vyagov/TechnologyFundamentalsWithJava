import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input;

        while (!"end".equalsIgnoreCase(input = scanner.nextLine())) {
            String[] command = input.split("\\s+");
            String paintingNumber, changedNumber, currentNum;

            switch (command[0].toLowerCase()) {
                case "change":
                    paintingNumber = command[1];
                    changedNumber = command[2];

                    for (int i = 0; i < numbers.size(); i++) {
                        if (paintingNumber.equals(numbers.get(i))) {
                            numbers.set(i, changedNumber);
                            break;
                        }
                    }
                    break;
                case "hide":
                    paintingNumber = command[1];

                    for (int i = 0; i < numbers.size(); i++) {
                        if (paintingNumber.equals(numbers.get(i))) {
                            numbers.remove(numbers.get(i));
                            break;
                        }
                    }
                    break;
                case "switch":
                    paintingNumber = command[1];
                    String paintingNumber2 = command[2];
                    int findIndex = 0;
                    int find2Index = 0;
                    boolean isFindIndex = false;
                    boolean isFind2Index = false;

                    for (int i = 0; i < numbers.size(); i++) {
                        if (paintingNumber.equals(numbers.get(i))) {
                            findIndex = i;
                            isFindIndex = true;
                        }
                        if (paintingNumber2.equals(numbers.get(i))) {
                            find2Index = i;
                            isFind2Index = true;
                        }
                    }
                    if (isFindIndex && isFind2Index) {
                        String temp = numbers.get(findIndex);
                        numbers.set(findIndex, numbers.get(find2Index));
                        numbers.set(find2Index, temp);
                    }
                    break;
                case "insert":
                    int index = Integer.parseInt(command[1]);
                    paintingNumber = command[2];

                    if (index < numbers.size()) {
                        numbers.add(index + 1, paintingNumber);
                    }
                    break;
                case "reverse":
                    Collections.reverse(numbers);
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }
}
