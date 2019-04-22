import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input;

        while (!"end".equalsIgnoreCase(input = scanner.nextLine())) {
            String[] commands = input.split("\\s+");
            String command = commands[0];
            String result = "";

            switch (command) {
                case "Contains":
                    int numContains = Integer.parseInt(commands[1]);
                    boolean isContain = numbers.contains(numContains);
                    result = isContain ? "Yes" : "No such number";

                    System.out.println(result);
                    break;
                case "Print":
                    String evenOrOdd = commands[1];

                    if ("even".equalsIgnoreCase(evenOrOdd)) {
                        result = printEvenNums(numbers);
                    }
                    if ("odd".equalsIgnoreCase(evenOrOdd)) {
                        result = printOddNums(numbers);
                    }
                    System.out.println(result);
                    break;
                case "Get":
                    int sum = sumNums(numbers);

                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commands[1];
                    int numCondition = Integer.parseInt(commands[2]);
                    result = filterByCondition(numbers, condition, numCondition);

                    System.out.println(result);
                    break;
            }
        }
    }

    static String printEvenNums(List<Integer> nums) {
        String result = "";

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                result += nums.get(i) + " ";
            }
        }
        return result.trim();
    }

    static String printOddNums(List<Integer> nums) {
        String result = "";

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                result += nums.get(i) + " ";
            }
        }
        return result.trim();
    }

    static int sumNums(List<Integer> nums) {
        int sum = 0;

        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    static String filterByCondition(List<Integer> nums, String condition, int num) {
        String result = "";

        switch (condition) {
            case "<":
                for (int i = 0; i < nums.size(); i++) {
                    if (nums.get(i) < num) {
                        result += nums.get(i) + " ";
                    }
                }
                break;
            case ">":
                for (int i = 0; i < nums.size(); i++) {
                    if (nums.get(i) > num) {
                        result += nums.get(i) + " ";
                    }
                }
                break;
            case ">=":
                for (int i = 0; i < nums.size(); i++) {
                    if (nums.get(i) >= num) {
                        result += nums.get(i) + " ";
                    }
                }
                break;
            case "<=":
                for (int i = 0; i < nums.size(); i++) {
                    if (nums.get(i) <= num) {
                        result += nums.get(i) + " ";
                    }
                }
                break;
        }
        return result.trim();
    }
}
