import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        String result = "";

        for (String second : secondArray) {
            for (String first : firstArray) {
                if (second.equals(first)) {
                    result += second + " ";
                }
            }
        }
        System.out.println(result.trim());
    }
}
