import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputStr = scanner.nextLine();

        String result = explosions(inputStr);

        System.out.println(result);
    }

    private static String explosions(String str) {
        StringBuilder result = new StringBuilder();
        int strength = 0;
        int count = 0;

        while (count < str.length()) {
            result.append(str.charAt(count));

            if (str.charAt(count) == '>') {
                strength += Character.getNumericValue(str.charAt(count + 1));
                count++;

                while (strength > 0 && count < str.length()) {
                    if(str.charAt(count) == '>') {
                        break;
                    }
                    count++;
                    strength--;
                }
            } else {
                count++;
            }
        }
        return result.toString();
    }
}
