import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceBook = new LinkedHashMap<>();
        String input;

        while (!"Lumpawaroo".equals(input = scanner.nextLine())) {
            String[] data = input.split("\\s+\\|\\s+|\\s+->\\s+");

            String forceSide, forceUser;

            if (input.contains("|")) {
                forceSide = data[0];
                forceUser = data[1];

                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new ArrayList<>());
                }
                if (forceBook.entrySet().stream().noneMatch(e -> e.getValue().contains(forceUser))) {
                    forceBook.get(forceSide).add(forceUser);
                }
            } else if (input.contains("->")) {
                forceSide = data[1];
                forceUser = data[0];

                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new ArrayList<>());
                }
                forceBook.forEach((key, value) -> value.remove(forceUser));

                forceBook.get(forceSide).add(forceUser);
                System.out.println(String.format("%s joins the %s side!", forceUser, forceSide));

            }
        }
        forceBook.entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());

                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());
                    }
                    return sort;
                })
                .forEach((e -> {
                    System.out.println(String.format("Side: %s, Members: %d", e.getKey(), e.getValue().size()));
                    Collections.sort(e.getValue());

                    e.getValue().forEach(u -> System.out.println("! " + u));
                }));
    }
}
