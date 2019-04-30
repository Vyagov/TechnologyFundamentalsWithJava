package AdvertisementMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMessage = Integer.parseInt(scanner.nextLine());

        Message message = new Message();

        for (int i = 0; i < numberOfMessage; i++) {
            System.out.println(message.randomMessage());
        }
    }
}
