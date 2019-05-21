import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String[] bombAndPower = scanner.nextLine().split("\\s+");

        String bomb = bombAndPower[0];

        for (int i = 0; i < numbers.size(); i++) {
            if (bomb.equals(numbers.get(i))) {
                int power = Integer.parseInt(bombAndPower[1]);

                while (power-- > 0) {
                    if (i + 1 < numbers.size()) {
                        numbers.remove(i + 1);
                    }
                    if (i - 1 >= 0) {
                        numbers.remove(i - 1);
                        i -= 1;
                    }
                }
                numbers.remove(i);
                i -= 1;
            }
        }
        int sum = 0;

        for (String str : numbers) {
            int num = Integer.parseInt(str);
            sum += num;
        }
        System.out.println(sum);
    }
}
