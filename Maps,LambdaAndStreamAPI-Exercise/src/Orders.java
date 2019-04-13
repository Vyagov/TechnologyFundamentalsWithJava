import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> products = new LinkedHashMap<>();
        String input;

        while (!"buy".equals(input = scanner.nextLine())) {
            String[] data = input.split("\\s+");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);

            if (!products.containsKey(name)) {
                List<Double> product = new ArrayList<>();
                product.add(price);
                product.add(quantity);
                products.put(name, product);
            } else {
                double currentQuantity = products.get(name).get(1);
                currentQuantity += quantity;
                products.get(name).set(1, currentQuantity);

                if (price != products.get(name).get(0)) {
                   products.get(name).set(0, price);
                }
            }
        }
        products.forEach((key, value) ->
                System.out.println(String.format("%s -> %.2f", key, value.get(0) * value.get(1))));
    }
}
