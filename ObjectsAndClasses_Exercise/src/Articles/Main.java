package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split(", ");
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        Article article = new Article(inputData[0], inputData[1], inputData[2]);

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = scanner.nextLine().split(": ");

            switch (command[0]) {
                case "Edit":
                    article.edit(command[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;
                case "Rename":
                    article.rename(command[1]);
                    break;
            }
        }
        System.out.println(article);
    }
}
