import java.util.ArrayList;

public class Playlist<T extends Song> {
    private ArrayList<T> songs = new ArrayList<>();

    public void addSong(T song) {
        songs.add(song);
    }

    public void playAll() {
        for (T song : songs) {
            song.play(); // polymorphism jalan di sini
        }
    }
}