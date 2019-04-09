import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = numberOfPeople / capacity;
        int remainder = numberOfPeople % capacity;

        if (remainder != 0) {
            courses++;
        }

        System.out.println(courses);
    }
}
