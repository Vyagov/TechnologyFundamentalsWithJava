import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceSabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        int moreSabers = (int)Math.ceil(countOfStudents * 10 / 100.0);
        int freeBelt = countOfStudents / 6;

        double totalPriceSabers = priceSabers * (countOfStudents + moreSabers);
        double totalPriceRobes = priceRobes * countOfStudents;
        double totalPriceBelts = priceBelts * (countOfStudents - freeBelt);

        double totalPrice = totalPriceSabers + totalPriceRobes + totalPriceBelts;

        if (amountOfMoney >= totalPrice) {
            System.out.println(String.format("The money is enough - it would cost %.2flv.", totalPrice));
        } else {
            double needed = totalPrice - amountOfMoney;
            System.out.println(String.format("Ivan Cho will need %.2flv more.", needed));
        }
    }
}
