import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> miner = new LinkedHashMap<>();
        String resource;

        while (!"stop".equals(resource = scanner.nextLine())) {
            int quantity = Integer.parseInt(scanner.nextLine());

            miner.putIfAbsent(resource, 0);
            miner.put(resource, miner.get(resource) + quantity);
        }
        miner.forEach((key, value) -> System.out.println(String.format("%s -> %d", key, value)));
    }
}
