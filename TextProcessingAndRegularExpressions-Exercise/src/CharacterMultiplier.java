import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split("\\s");

        String firstStr = strings[0];
        String secondStr = strings[1];

        int result = sumMultipliedChars(firstStr, secondStr);

        System.out.println(result);
    }

    private static int sumMultipliedChars(String str1, String str2) {
        int minLen, maxLen;
        String minLenStr, maxLenStr;
        int sum = 0;

        if (str1.length() <= str2.length()) {
            minLen = str1.length();
            minLenStr = str1;
            maxLen = str2.length();
            maxLenStr = str2;
        } else {
            minLen = str2.length();
            minLenStr = str2;
            maxLen = str1.length();
            maxLenStr = str1;
        }

        for (int i = 0; i < maxLen; i++) {
            if (i < minLen) {
                sum += minLenStr.charAt(i) * maxLenStr.charAt(i);
            } else {
                sum += maxLenStr.charAt(i);
            }
        }
        return sum;
    }
}
