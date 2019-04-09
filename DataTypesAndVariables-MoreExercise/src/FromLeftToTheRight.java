import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();

            String[] parts = input.split(" ");
            long leftNum = Long.parseLong(parts[0]);
            long rightNum = Long.parseLong(parts[1]);

            String biggerNum = "" + (leftNum > rightNum ? Math.abs(leftNum) : Math.abs(rightNum));
            int sum = 0;

            for (int j = 0; j < biggerNum.length(); j++) {
                int digit = Integer.parseInt("" + biggerNum.charAt(j));
                sum += digit;
            }
            System.out.println(sum);
        }
    }
}
