import java.util.*;
import java.util.stream.Collectors;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input;

        while (!"end".equals(input = scanner.nextLine())) {
            String[] data = input.split("\\s+:\\s+");
            String courseName = data[0];
            String studentName = data[1];
            List<String> students = new ArrayList<>();

            if (!courses.containsKey(courseName)) {
                students.add(studentName);
                courses.put(courseName, students);
            } else {
                courses.get(courseName).add(studentName);
            }
        }
        courses.entrySet()
                .stream()
                .sorted((e2, e1) -> Integer.compare(e1.getValue().size(), e2.getValue().size()))
                .forEach((e -> {
                    System.out.println(String.format("%s: %d", e.getKey(), e.getValue().size()));
                    Collections.sort(e.getValue());

                    for (String str : e.getValue()) {
                        System.out.println("-- " + str);
                    }
                }));
    }
}
