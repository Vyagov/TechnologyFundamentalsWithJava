import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        if (firstNum < secondNum) {
            firstNum ^= secondNum;
            secondNum ^= firstNum;
            firstNum ^= secondNum;
        }
        if (firstNum < thirdNum) {
            firstNum ^= thirdNum;
            thirdNum ^= firstNum;
            firstNum ^= thirdNum;
        }
        if (secondNum < thirdNum) {
            secondNum ^= thirdNum;
            thirdNum ^= secondNum;
            secondNum ^= thirdNum;
        }
        System.out.println(firstNum);
        System.out.println(secondNum);
        System.out.println(thirdNum);
    }
}
