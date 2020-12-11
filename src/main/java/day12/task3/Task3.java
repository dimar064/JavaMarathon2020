package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Gruppa Skryptonite", 2018));
        musicBands.add(new MusicBand("The Beatles", 1960));
        musicBands.add(new MusicBand("The Cure", 1976));
        musicBands.add(new MusicBand("Tame impala", 2007));
        musicBands.add(new MusicBand("Jefferson Airplane", 1965));
        musicBands.add(new MusicBand("Boney M", 1975));
        musicBands.add(new MusicBand("ABBA", 1980));
        musicBands.add(new MusicBand("Arctic Monkeys", 2002));
        musicBands.add(new MusicBand("The Mars Volta", 2001));
        musicBands.add(new MusicBand("Joy Division", 1976));

        System.out.println(musicBands);
        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println(groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> newMusicBands = new ArrayList<>();
        for (MusicBand musicBand : bands) {
            if (musicBand.getYear() > 2000) {
                newMusicBands.add(musicBand);
            }
        }
        return newMusicBands;
    }
}