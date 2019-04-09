import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());

        long result;
        long maxResult = 0L;
        int currentSnowballSnow = 0;
        int currentSnowballTime = 0;
        int currentSnowballQuality = 0;

        for (int snowball = 0; snowball < numberOfSnowballs; snowball++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            int divide = snowballSnow / snowballTime;
            result = (long) Math.pow(divide, snowballQuality);

            if (result > maxResult) {
                maxResult = result;
                currentSnowballSnow = snowballSnow;
                currentSnowballTime = snowballTime;
                currentSnowballQuality = snowballQuality;
            }
        }
        System.out.println(String.format("%d : %d = %d (%d)", currentSnowballSnow, currentSnowballTime, maxResult, currentSnowballQuality));

    }
}
