import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();

        int lastIndex = num.length() - 1;
        char lastChar = num.charAt(lastIndex);
        int lastDigit = Integer.parseInt("" + lastChar);
        String nameLastDigit = "";

        switch (lastDigit) {
            case 0:
                nameLastDigit = "zero";
                break;
            case 1:
                nameLastDigit = "one";
                break;
            case 2:
                nameLastDigit = "two";
                break;
            case 3:
                nameLastDigit = "three";
                break;
            case 4:
                nameLastDigit = "four";
                break;
            case 5:
                nameLastDigit = "five";
                break;
            case 6:
                nameLastDigit = "six";
                break;
            case 7:
                nameLastDigit = "seven";
                break;
            case 8:
                nameLastDigit = "eight";
                break;
            case 9:
                nameLastDigit = "nine";
                break;
        }
        System.out.println(nameLastDigit);
    }
}
