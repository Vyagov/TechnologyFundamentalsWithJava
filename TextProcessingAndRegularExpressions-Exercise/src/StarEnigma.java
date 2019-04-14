import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> planets = new LinkedHashMap<>();
        planets.put("A", new ArrayList<>());
        planets.put("D", new ArrayList<>());

        while (lines-- > 0) {
            String encryptedMessage = scanner.nextLine();

            int countSTAR = countSymbolSTAR(encryptedMessage);
            String decryptedMessage = decryptedWithKey(encryptedMessage, countSTAR);

            String regex = "@(?<planetName>[A-Za-z]+)(?:[^@\\-!:>]*):(\\d+)(?:[^@\\-!:>]*)" +
                    "!(?<attackType>[A|D])!(?:[^@\\-!:>]*)->(\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decryptedMessage);

            if (matcher.find()) {
                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attackType");

                planets.get(attackType).add(planetName);
            }
        }
        planets.forEach((key, value) -> Collections.sort(value));

        System.out.println("Attacked planets: " + planets.get("A").size());

        if (planets.get("A").size() != 0) {
            planets.get("A").forEach(name -> System.out.println("-> " + name));
        }
        System.out.println("Destroyed planets: " + planets.get("D").size());

        if (planets.get("D").size() != 0) {
            planets.get("D").forEach(name -> System.out.println("-> " + name));
        }
    }

    private static int countSymbolSTAR(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }
        return count;
    }

    private static String decryptedWithKey(String str, int key) {
        StringBuilder decryptedMessage = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = (char) (str.charAt(i) - key);
            decryptedMessage.append(ch);
        }
        return decryptedMessage.toString();
    }
}
