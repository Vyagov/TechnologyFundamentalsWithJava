import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int line = 0; line < lines; line++) {
            products.add(scanner.nextLine());
        }
        Collections.sort(products);
        int count = 1;

        for (String str : products) {
            System.out.println(String.format("%d.%s", count, str));
            count++;
        }
    }
}
