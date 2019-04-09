import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine()); // poke power
        int M = Integer.parseInt(scanner.nextLine()); // poke targets
        int Y = Integer.parseInt(scanner.nextLine()); // exhaustion factor

        double halfN = N * 50 / 100.0;
        int count = 0;

        while (N >= M) {
            N -= M;

            if (halfN == N) {
                N /= Y;
            }
            count++;
        }
        System.out.println(N);
        System.out.println(count);
    }
}
