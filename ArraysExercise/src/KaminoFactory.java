import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String sequence;
        int currentIndex = 0;
        int maxIndex = 0;
        int currentSum = 0;
        int bestSequenceIndex = length;
        int bestSequenceSum = 0;
        int currentCount = 0;
        int maxCount = 0;
        int bestCount = 0;
        int bestSequenceIndexRow = 0;
        int bestSequenceIndexRowOutput = 0;
        String sequenceOutput = "";

        while (!"Clone them!".equals(sequence = scanner.nextLine())) {
            int[] numSequence = Arrays.stream(sequence.split("!+")).mapToInt(Integer::parseInt).toArray();

            ++bestSequenceIndexRow;
            currentSum = 0;
            currentCount = 0;
            maxCount = 0;


            for (int index = 0; index < numSequence.length; index++) {
                if (numSequence[index] == 1) {
                    currentIndex = index;
                    currentSum += numSequence[index];
                    currentCount++;
                } else {
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        maxIndex = currentIndex - maxCount;
                    }
                    currentCount = 0;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxIndex = currentIndex - maxCount;
            }
            if (maxIndex < bestSequenceIndex || currentSum > bestSequenceSum) {
                sequenceOutput = "";
                bestSequenceIndex = maxIndex;
                bestSequenceSum = currentSum;
                bestSequenceIndexRowOutput = bestSequenceIndexRow;

                for (int i1 : numSequence) {
                    sequenceOutput += i1 + " ";
                }
            }
        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.", bestSequenceIndexRowOutput, bestSequenceSum));
        System.out.println(sequenceOutput.trim());
    }
}
