package Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        while (numberOfSongs-- > 0) {
            String[] inputData = scanner.nextLine().split("_+");

            String type = inputData[0];
            String name = inputData[1];
            String time = inputData[2];

            Song song = new Song();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }
        String typeList = scanner.nextLine();

        if ("All".equalsIgnoreCase(typeList)) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (typeList.equalsIgnoreCase(song.getTypeList())) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
