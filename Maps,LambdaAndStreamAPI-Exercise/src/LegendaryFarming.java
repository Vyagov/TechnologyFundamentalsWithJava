import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        Map<String, Integer> junks = new TreeMap<>();
        boolean isWinner = false;

        while (!isWinner) {
            String[] materials = scanner.nextLine().split("\\s+");

            for (int i = 0; i < materials.length; i += 2) {
                String material = materials[i + 1].toLowerCase();
                int quantity = Integer.parseInt(materials[i]);

                switch (material) {
                    case "shards":
                    case "fragments":
                    case "motes":
                        keyMaterials.put(material, keyMaterials.get(material) + quantity);

                        if (keyMaterials.get(material) >= 250) {
                            keyMaterials.put(material, keyMaterials.get(material) - 250);
                            isWinner = true;

                            switch (material) {
                                case "shards":
                                    System.out.println("Shadowmourne obtained!");
                                    break;
                                case "fragments":
                                    System.out.println("Valanyr obtained!");
                                    break;
                                case "motes":
                                    System.out.println("Dragonwrath obtained!");
                                    break;
                            }
                        }
                        break;
                    default:
                        junks.putIfAbsent(material, 0);
                        junks.put(material, junks.get(material) + quantity);
                        break;
                }
                if (isWinner) {
                    break;
                }
            }
        }
        keyMaterials.entrySet().stream().sorted((e2, e1) -> {
            int sort = e1.getValue().compareTo(e2.getValue());

            if (sort == 0) {
                sort = e2.getKey().compareTo(e1.getKey());
            }
            return sort;
        }).forEach(e -> {
            String pattern = "%s: %d";
            System.out.println(String.format(pattern, e.getKey(), e.getValue()));
        });
        junks.forEach((key, value) -> {
            String pattern = "%s: %d";
            System.out.println(String.format(pattern, key, value));
        });
    }
}
