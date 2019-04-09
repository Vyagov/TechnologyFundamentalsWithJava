import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        while (!"END".equalsIgnoreCase(input = scanner.nextLine())) {
            int len = input.length();
            boolean isChar = false;
            boolean isString = false;
            boolean isInteger = true;
            boolean isBoolean = false;
            boolean isFloatingPoint = false;
            int onePoint = 0;

            if ("true".equalsIgnoreCase(input) || "false".equalsIgnoreCase(input)) {
                isBoolean = true;
                isInteger = false;
                isFloatingPoint = false;
                isChar = false;
                isString = false;
            } else {
                for (int i = 0; i < len; i++) {
                    int symbol = input.charAt(i);

                    if (!((symbol >= 46 && symbol <= 57 && symbol != 47) || (symbol == 45 && i == 0))) {
                        isInteger = false;
                        isFloatingPoint = false;

                        if (len == 1) {
                            isChar = true;
                        } else {
                            isString = true;
                        }
                    } else {
                        if (symbol == 46) {
                            isFloatingPoint = true;
                            isInteger = false;
                            onePoint++;
                        }
                    }

                }
            }
            if (isInteger) {
                System.out.println(input + " is integer type");
            }
            if (isFloatingPoint && onePoint == 1) {
                System.out.println(input + " is floating point type");
            }
            if (isBoolean) {
                System.out.println(input + " is boolean type");
            }
            if (isChar) {
                System.out.println(input + " is character type");
            }
            if (isString || onePoint > 1) {
                System.out.println(input + " is string type");
            }
        }
    }
}
