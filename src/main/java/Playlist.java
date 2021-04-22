import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    public String name;
    public ArrayList<Song> songs;
    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }
    public boolean isEmpty() {
        return songs.size() == 0;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public String[] songNames() {
        String[] songNames = new String[songs.size()];
        for (int i = 0; i < songs.size(); i++) {
            songNames[i] = songs.get(i).title;
        }
        return songNames;
    }

    public int totalDuration() {
        int totalDuration = 0;
        for (Song song : songs) {
            totalDuration += song.durationInSeconds;
        }
        return totalDuration;
    }

    public void swap(Song song1, Song song2) {
        Collections.swap(songs, songs.indexOf(song1), songs.indexOf(song2));
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }
}
