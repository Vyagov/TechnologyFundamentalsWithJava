import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        boolean isLogged = false;
        String reversedUsername = "";
        int len = username.length();
        int count = 1;

        for (int letter = 0; letter < len; letter++) {
            reversedUsername += username.charAt(len - 1 - letter);
        }

        while (!password.equalsIgnoreCase(reversedUsername)) {
            if (count++ == 4) {
                System.out.println(String.format("User %s blocked!", username));
                return;
            }
            System.out.println("Incorrect password. Try again.");

            password = scanner.nextLine();
        }
        System.out.println(String.format("User %s logged in.", username));
    }
}
