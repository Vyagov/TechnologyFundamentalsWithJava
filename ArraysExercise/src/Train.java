import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfWagons = Integer.parseInt(scanner.nextLine());

        String train = "";
        int sumPeopleInTrain = 0;

        for (int wagons = 0; wagons < countOfWagons; wagons++) {
            int peopleGetWagons = Integer.parseInt(scanner.nextLine());

            sumPeopleInTrain += peopleGetWagons;
            train += peopleGetWagons + " ";
        }
        System.out.println(train.trim());
        System.out.println(sumPeopleInTrain);
    }
}
