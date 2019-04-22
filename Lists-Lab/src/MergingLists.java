import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int len = firstList.size() >= secondList.size() ? firstList.size() : secondList.size();
        List<Integer> resultList = new ArrayList<>();
        int count = -1;

        while (count++ < len - 1) {
            if (count < firstList.size() || firstList.size() >= secondList.size()) {
                resultList.add(firstList.get(count));
            }
            if (count < secondList.size() || firstList.size() < secondList.size()) {
                resultList.add(secondList.get(count));
            }
        }
        System.out.println(resultList.toString().replaceAll("[\\[,\\]]", ""));
    }
}
