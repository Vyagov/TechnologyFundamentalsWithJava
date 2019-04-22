import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input;

        while (!"end".equals(input = scanner.nextLine())) {
            String[] commandsStr = input.split("\\s+");
            String command = commandsStr[0];

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(commandsStr[1]);
                    if (index >= 0 && index < numbers.length) {
                        numbers = exchange(numbers, index);
                        break;
                    }
                    System.out.println("Invalid index");
                    break;
                case "max":
                    String maxEvenOrOdd = commandsStr[1];
                    String maxElem = maxEvenOrOdd.equals("even") ? maxEven(numbers) : maxOdd(numbers);
                    System.out.println(maxElem);
                    break;
                case "min":
                    String minEvenOrOdd = commandsStr[1];
                    String minElem = minEvenOrOdd.equals("even") ? minEven(numbers) : minOdd(numbers);
                    System.out.println(minElem);
                    break;
                case "first":
                    int countFirst = Integer.parseInt(commandsStr[1]);
                    String firstEvenOrOdd = commandsStr[2];
                    String firstResult = firstEvenOrOdd.equals("even") ? firstEven(numbers, countFirst) : firstOdd(numbers, countFirst);
                    System.out.println(firstResult);
                    break;
                case "last":
                    int countLast = Integer.parseInt(commandsStr[1]);
                    String lastEvenOrOdd = commandsStr[2];
                    String lastResult = lastEvenOrOdd.equals("even") ? lastEven(numbers, countLast) : lastOdd(numbers, countLast);
                    System.out.println(lastResult);
                    break;
            }
        }
        String result = "[";

        for (int num : numbers) {
            result += num + " ";
        }
        result = result.trim();
        System.out.println(result.replace(" ", ", ") + "]");
    }

    private static int[] exchange(int[] nums, int index) {
        int len = nums.length;
        String result = "";

        for (int rotation = index + 1; rotation < len + index + 1; rotation++) {
            result += rotation < len ? nums[rotation] + " " : nums[rotation - len] + " ";
        }
        return Arrays.stream(result.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static String maxEven(int[] nums) {
        int indexMaxEvenElem = -1;
        int maxEvenElem = Integer.MIN_VALUE;
        boolean isMaxEvenElem = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] >= maxEvenElem) {
                maxEvenElem = nums[i];
                indexMaxEvenElem = i;
                isMaxEvenElem = true;
            }
        }
        return isMaxEvenElem ? indexMaxEvenElem + "" : "No matches";
    }

    private static String maxOdd(int[] nums) {
        int indexMaxOddElem = -1;
        int maxOddElem = Integer.MIN_VALUE;
        boolean isMaxOddElem = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0 && nums[i] >= maxOddElem) {
                maxOddElem = nums[i];
                indexMaxOddElem = i;
                isMaxOddElem = true;
            }
        }
        return isMaxOddElem ? indexMaxOddElem + "" : "No matches";
    }

    private static String minEven(int[] nums) {
        int len = nums.length;
        int minEvenElem = Integer.MAX_VALUE;
        int indexMinEvenElem = len;
        boolean isMinEvenElem = false;

        for (int i = 0; i < len; i++) {
            if (nums[i] % 2 == 0 && nums[i] <= minEvenElem) {
                minEvenElem = nums[i];
                indexMinEvenElem = i;
                isMinEvenElem = true;
            }
        }
        return isMinEvenElem ? indexMinEvenElem + "" : "No matches";
    }

    private static String minOdd(int[] nums) {
        int len = nums.length;
        int minOddElem = Integer.MAX_VALUE;
        int indexMinOddElem = len;
        boolean isMinOddElem = false;

        for (int i = 0; i < len; i++) {
            if (nums[i] % 2 != 0 && nums[i] <= minOddElem) {
                minOddElem = nums[i];
                indexMinOddElem = i;
                isMinOddElem = true;
            }
        }
        return isMinOddElem ? indexMinOddElem + "" : "No matches";
    }

    private static String firstEven(int[] nums, int count) {
        String result = " ";
        int currentCount = 1;

        if (count <= nums.length) {
            for (int num : nums) {
                if (num % 2 == 0 && count >= currentCount) {
                    result += num + " ";
                    currentCount++;
                }
            }
            result = result.trim();
        }
        return result.equals(" ") ? "Invalid count" : "[" + result.replace(" ", ", ") + "]";
    }

    private static String firstOdd(int[] nums, int count) {
        String result = " ";
        int currentCount = 1;

        if (count <= nums.length) {
            for (int num : nums) {
                if (num % 2 != 0 && count >= currentCount) {
                    result += num + " ";
                    currentCount++;
                }
            }
            result = result.trim();
        }
        return result.equals(" ") ? "Invalid count" : "[" + result.replace(" ", ", ") + "]";
    }

    private static String lastEven(int[] nums, int count) {
        String result = " ";
        int len = nums.length;
        int currentCount = 1;

        if (count <= len) {
            for (int i = len - 1; i >= 0; i--) {
                if (nums[i] % 2 == 0 && count >= currentCount) {
                    result += nums[i] + " ";
                    currentCount++;
                }
            }
            result = result.trim();
        }
        return result.equals(" ") ? "Invalid count" : result.equals("") ? "[]" : Arrays.toString(strReverse(result));
    }

    private static String lastOdd(int[] nums, int count) {
        String result = " ";
        int len = nums.length;
        int currentCount = 1;

        if (count <= len) {
            for (int i = len - 1; i >= 0; i--) {
                if (nums[i] % 2 != 0 && count >= currentCount) {
                    result += nums[i] + " ";
                    currentCount++;
                }
            }
            result = result.trim();
        }
        return result.equals(" ") ? "Invalid count" : result.equals("") ? "[]" : Arrays.toString(strReverse(result));
    }

    private static int[] strReverse(String str) {
        int[] array = Arrays.stream(str.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int temp;
        int len = array.length;

        for (int i = 0; i < len / 2; i++) {
            temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
        }
        return array;
    }
}