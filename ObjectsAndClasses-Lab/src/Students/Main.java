package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData;
        List<Student> students = new ArrayList<>();

        while (!"end".equalsIgnoreCase(inputData = scanner.nextLine())) {
            String[] studentsInfo = inputData.split("\\s+");

            Student student = new Student(studentsInfo[0], studentsInfo[1], studentsInfo[2], studentsInfo[3]);

            students.add(student);
        }
        String city = scanner.nextLine();

        List<Student> filterStudentByCity = students.stream().filter(e -> e.getCity().equals(city)).collect(Collectors.toList());

        for (Student student : filterStudentByCity) {
            System.out.println(String.format("%s %s is %s years old", student.getFirstName(), student.getLastName(), student.getAge()));
        }
    }
}
