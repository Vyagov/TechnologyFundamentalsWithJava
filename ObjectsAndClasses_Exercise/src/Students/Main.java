package Students;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        while (numberOfLines-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");

            Student student = new Student(data[0], data[1], Double.parseDouble(data[2]));

            students.add(student);
        }
        students.stream().sorted((s2, s1) -> Double.compare(s1.getGrade(), s2.getGrade())).forEach(student -> System.out.println(student.toString()));
    }
}
