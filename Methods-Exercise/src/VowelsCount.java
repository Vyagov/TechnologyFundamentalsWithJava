import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        System.out.println(vowelsCount(input));
    }

    public static int vowelsCount(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'u':
                case 'e':
                case 'i':
                case 'o':
                    count++;
                    break;
            }
        }
        return count;
    }
}
