import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double area = calcAreaRectangle(width, height);

        DecimalFormat df = new DecimalFormat("#.##");
        String result = df.format(area);

        System.out.println(result);
    }

    public static double calcAreaRectangle(double width, double height) {
        return width * height;
    }
}
