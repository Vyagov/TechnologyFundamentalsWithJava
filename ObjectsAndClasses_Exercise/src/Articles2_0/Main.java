package Articles2_0;

import Articles.Article;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        List<Article> articles = new ArrayList<>();

        while (numberOfLines-- > 0) {
            String[] inputData = scanner.nextLine().split(", ");
            Article article = new Article(inputData[0], inputData[1], inputData[2]);

            articles.add(article);
        }
        String sortedByCriteria = scanner.nextLine().toLowerCase();

        switch (sortedByCriteria) {
            case "title":
                articles.stream().sorted(Comparator.comparing(Article::getTitle)).forEach(System.out::println);
                break;
            case "content":
                articles.stream().sorted(Comparator.comparing(Article::getContent)).forEach(System.out::println);
                break;
            case "author":
                articles.stream().sorted(Comparator.comparing(Article::getAuthor)).forEach(System.out::println);
                break;
        }
    }
}
