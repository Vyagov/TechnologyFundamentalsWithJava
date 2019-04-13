import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();
        int inputLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputLines; i++) {
            String name = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());

            List<Double> grades = new ArrayList<>();

            if (!students.containsKey(name)) {
                grades.add(grade);
                students.put(name, grades);
            } else {
                students.get(name).add(grade);
            }
        }
        Map<String, Double> bestAverage = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> kvp : students.entrySet()) {
            double averageGrade = kvp.getValue().stream().mapToDouble(a -> a).average().getAsDouble();

            if (averageGrade >= 4.50) {
                bestAverage.put(kvp.getKey(), averageGrade);
            }
        }

        bestAverage.entrySet()
                .stream()
                .sorted((e2, e1) -> Double.compare(e1.getValue(), e2.getValue()))
                .forEach(e -> System.out.println(String.format("%s -> %.2f", e.getKey(), e.getValue())));
    }
}
