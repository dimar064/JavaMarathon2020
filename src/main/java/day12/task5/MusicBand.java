package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band2.getMembers().addAll(band1.getMembers());
        band1.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(members);
    }

    public List<MusicArtist> getMembers() {
        return members;
    }
}