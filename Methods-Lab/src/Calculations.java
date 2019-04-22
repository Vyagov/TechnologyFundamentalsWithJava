import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (command.toLowerCase()) {
            case "add":
                add(firstNum, secondNum);
                break;
            case "multiply":
                multiply(firstNum, secondNum);
                break;
            case "subtract":
                subtract(firstNum, secondNum);
                break;
            case "divide":
                divide(firstNum, secondNum);
                break;
        }
    }

    public static void add(int num1, int num2) {

        System.out.println(num1 + num2);
    }

    public static void multiply(int num1, int num2) {

        System.out.println(num1 * num2);
    }

    public static void subtract(int num1, int num2) {

        System.out.println(num1 - num2);
    }

    public static void divide(int num1, int num2) {

        System.out.println(num1 / num2);
    }
}
