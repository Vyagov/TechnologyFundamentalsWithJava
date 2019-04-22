import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int halfLen = numbers.size() / 2;

        for (int i = 0; i < halfLen; i++) {
            int first = numbers.get(i);
            int last = numbers.get(numbers.size() - 1);

            numbers.set(i, first + last);
            numbers.remove(numbers.size() - 1);

        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }

    static String concatElem(List<Integer> list) {
        String result = "";
        DecimalFormat df = new DecimalFormat("#.###");

        for (Integer num : list) {
            result += df.format(num) + " ";
        }
        return result.trim();
    }
}
