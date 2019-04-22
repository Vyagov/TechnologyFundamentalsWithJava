import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> counts = new TreeMap<>();

        for (double num : nums) {
            counts.putIfAbsent(num, 0);
            counts.put(num, counts.get(num) + 1);
        }
        for (Map.Entry<Double, Integer> kvp : counts.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.######");
            System.out.println(String.format("%s -> %d", df.format(kvp.getKey()), kvp.getValue()));
        }
    }
}
