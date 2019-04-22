import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        int firstNum, secondNum;
        char firstChar, secondChar;

        switch (type.toLowerCase()) {
            case "int":
                firstNum = Integer.parseInt(firstInput);
                secondNum = Integer.parseInt(secondInput);
                System.out.println(getMax(firstNum, secondNum));
                break;
            case "char":
                firstChar = firstInput.charAt(0);
                secondChar = secondInput.charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                System.out.println(getMax(firstInput, secondInput));
                break;
        }
    }

    public static int getMax(int num1, int num2) {
        if (num1 >= num2) {
            return num1;
        }
        return num2;
    }

    public static char getMax(char ch1, char ch2) {
        if (ch1 >= ch2) {
            return ch1;
        }
        return ch2;
    }

    public static String getMax(String str1, String str2) {
        if (str1.compareTo(str2) >= 0) {
            return str1;
        }
        return str2;
    }
}

