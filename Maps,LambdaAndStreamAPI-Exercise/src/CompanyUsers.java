import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> users = new TreeMap<>();
        String input;

        while (!"End".equals(input = scanner.nextLine())) {

            String[] data = input.split("\\s+->\\s+");
            String companyName = data[0];
            String id = data[1];
            List<String> ids = new ArrayList<>();

            if (!users.containsKey(companyName)) {
                ids.add(id);
                users.put(companyName, ids);
            } else {
                if (!users.get(companyName).contains(id)) {
                    users.get(companyName).add(id);
                }
            }
        }
        users.forEach((key, value) -> {
                    System.out.println(key);

                    for (String str : value) {
                        System.out.println("-- " + str);
                    }
                });
    }
}
