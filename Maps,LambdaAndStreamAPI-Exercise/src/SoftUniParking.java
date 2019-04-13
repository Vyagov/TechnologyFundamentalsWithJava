import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> validates = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String command = input[0];
            String username = input[1];

            switch (command) {
                case "register":
                    String licensePlateNumber = input[2];

                    if (!validates.containsKey(username)) {
                        validates.put(username, licensePlateNumber);
                        System.out.println(String.format("%s registered %s successfully", username, licensePlateNumber));
                    } else {
                        System.out.println("ERROR: already registered with plate number " + licensePlateNumber);
                    }
                    break;
                case "unregister":
                    if (!validates.containsKey(username)) {
                        System.out.println(String.format("ERROR: user %s not found", username));
                    } else {
                        validates.remove(username);
                        System.out.println(username + " unregistered successfully");
                    }
                    break;
            }
        }
        validates.forEach((key, value) -> System.out.println(String.format("%s => %s", key, value)));
    }
}
