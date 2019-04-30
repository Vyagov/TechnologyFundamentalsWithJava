package OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        List<PersonData> personsData = new ArrayList<>();

        while (!"End".equals(input = scanner.nextLine())) {
            String[] data = input.split("\\s+");

            PersonData personData = new PersonData(data[0], data[1], Integer.parseInt(data[2]));

            personsData.add(personData);
        }
        personsData.stream().sorted(Comparator.comparing(PersonData::getAge)).forEach(System.out::println);
    }
}
