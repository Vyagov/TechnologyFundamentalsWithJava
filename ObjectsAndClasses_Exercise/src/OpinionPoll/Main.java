package OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        List<Person> persons = new ArrayList<>();

        for (int line = 0; line < numberOfLines; line++) {
            String[] inputData = scanner.nextLine().split("\\s+");

            Person person = new Person(inputData[0], Integer.parseInt(inputData[1]));

            persons.add(person);
        }
        persons.stream().filter(person -> person.getAge() > 30).sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
    }
}
