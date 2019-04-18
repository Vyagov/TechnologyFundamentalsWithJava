import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String str : text) {
            for (int j = 0; j < str.length(); j++) {
                result.append(str);
            }
        }
        System.out.println(result);
    }
}
