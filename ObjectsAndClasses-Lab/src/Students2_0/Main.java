package Students2_0;

import Students.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData;
        List<Students.Student> students = new ArrayList<>();

        while (!"end".equalsIgnoreCase(inputData = scanner.nextLine())) {
            String[] studentsInfo = inputData.split("\\s+");

            String firstName = studentsInfo[0];
            String lastName = studentsInfo[1];
            String age = studentsInfo[2];
            String city = studentsInfo[3];

            if (IsStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setCity(city);
            } else {
                Student student = new Student(firstName, lastName, age, city);
                students.add(student);
            }
        }
        String city = scanner.nextLine();

        List<Students.Student> filterStudentByCity = students.stream().filter(e -> e.getCity().equals(city)).collect(Collectors.toList());

        for (Student student : filterStudentByCity) {
            System.out.println(String.format("%s %s is %s years old", student.getFirstName(), student.getLastName(), student.getAge()));
        }
    }

    private static boolean IsStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }
}
