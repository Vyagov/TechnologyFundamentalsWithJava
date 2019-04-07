import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArray = scanner.nextLine().split(" ");
        int  len = strArray.length;

        for (int str = 0; str < len / 2; str++) {
            String temp = strArray[str];
            strArray[str] = strArray[len - 1 - str];
            strArray[len - 1 - str] = temp;
        }
        String result = "";
        for (String s : strArray) {
            result += s + " ";
        }
        System.out.println(result);
    }
}
