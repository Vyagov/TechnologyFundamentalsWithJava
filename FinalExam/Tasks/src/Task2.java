import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        Map<String, List<String>> stores = new LinkedHashMap<>();

        while (!"END".equals(input = scanner.nextLine())) {
            String[] data = input.split("->");

            String command = data[0];
            String store = data[1];

            if ("Remove".equals(command)) {
                stores.remove(store);
            } else if ("Add".equals(command)) {
                List<String> items = new ArrayList<>();

                if (data[2].indexOf(',') >= 0) {
                    items = Arrays.stream(data[2].split(",")).collect(Collectors.toList());
                } else {
                    items.add(data[2]);
                }
                if (!stores.containsKey(store)) {
                    stores.put(store, new ArrayList<>());
                }
                stores.get(store).addAll(items);
            }
        }
        System.out.println("Stores list:");

        stores.entrySet().stream()
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());

                    if (sort == 0) {
                        sort = e2.getKey().compareTo(e1.getKey());
                    }
                    return sort;
                })
                .forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue().forEach(item -> System.out.println(String.format("<<%s>>", item)));
                });
    }
}
