import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double firstNum = numbers.get(i);
            double secondNUm = numbers.get(i + 1);

            if (firstNum == secondNUm) {
                double sum = firstNum + secondNUm;

                numbers.set(i, sum);
                numbers.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(concatElem(numbers));
    }

    static String concatElem(List<Double> list) {
        String result = "";
        DecimalFormat df = new DecimalFormat("#.###");

        for (Double num : list) {
            result += df.format(num) + " ";
        }
        return result.trim();
    }
}
