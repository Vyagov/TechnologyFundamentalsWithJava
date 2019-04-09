import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        double biggestVolume = 0.0;
        String modelOfBiggestKeg = "";

        for (int line = 0; line < numberOfLines; line++) {
            String modelOfKeg = scanner.nextLine();
            double radiusOfKeg = Double.parseDouble(scanner.nextLine());
            int heightOfKeg = Integer.parseInt(scanner.nextLine());

            double volumeOfKeg = Math.PI * Math.pow(radiusOfKeg, 2) * heightOfKeg;

            if (biggestVolume < volumeOfKeg) {
                biggestVolume = volumeOfKeg;
                modelOfBiggestKeg = modelOfKeg;
            }
        }
        System.out.println(modelOfBiggestKeg);
    }
}
