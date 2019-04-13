import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        String output = grade >= 3.00 ? "Passed!" : "Failed!";

        System.out.println(output);
    }
}
