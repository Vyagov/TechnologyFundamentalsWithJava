import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CookingFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int bestTotalQuality = Integer.MIN_VALUE;
        List<Integer> breadBatch = new ArrayList<>();

        while (!"Bake It!".equalsIgnoreCase(input = scanner.nextLine())) {
            List<Integer> nums = Arrays.stream(input.split("\\#+")).map(Integer::parseInt).collect(Collectors.toList());
            int totalQuality = 0;

            for (Integer num : nums) {
                totalQuality += num;
            }
            if (totalQuality > bestTotalQuality) {
                bestTotalQuality = totalQuality;
                breadBatch = nums;
            } else if (totalQuality == bestTotalQuality) {
                double averageQuality = totalQuality * 1.0 / nums.size();
                double bestAverageQuality = bestTotalQuality * 1.0 / breadBatch.size();

                if (averageQuality > bestAverageQuality) {
                    breadBatch = nums;
                } else if (averageQuality == bestAverageQuality) {
                    if (nums.size() <  breadBatch.size()) {
                        breadBatch = nums;
                    }
                }
            }
        }
        System.out.println("Best Batch quality: " + bestTotalQuality);
        System.out.println(breadBatch.toString().replaceAll("[\\[,\\]]", ""));
    }
}
