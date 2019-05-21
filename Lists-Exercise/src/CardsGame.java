import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstPlayerCards.size() > 0 && secondPlayerCards.size() > 0) {
            int cardFirstPlayer = firstPlayerCards.get(0);
            int cardSecondPlayer = secondPlayerCards.get(0);

            if (cardFirstPlayer > cardSecondPlayer){
                firstPlayerCards.add(cardFirstPlayer);
                firstPlayerCards.add(cardSecondPlayer);

                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
            } else if (cardFirstPlayer < cardSecondPlayer) {
                secondPlayerCards.add(cardSecondPlayer);
                secondPlayerCards.add(cardFirstPlayer);

                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
            } else {
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
            }
        }
        int sum = 0;

        if (firstPlayerCards.size() > 0) {
            for (int card : firstPlayerCards) {
                sum += card;
            }
            System.out.println("First player wins! Sum: " + sum);
        } else if (secondPlayerCards.size() > 0) {
            for (int card : secondPlayerCards) {
                sum += card;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}
